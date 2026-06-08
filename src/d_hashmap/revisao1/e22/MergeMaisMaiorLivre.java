package d_hashmap.revisao1.e22;

import java.util.HashMap;
import java.util.Map;

public class MergeMaisMaiorLivre {
    // Dado um registro de gols, some o total de cada jogador e encontre o artilheiro.
    static void main() {
        String[] jogadores = {"Neymar", "Vini", "Neymar", "Raphinha", "Vini", "Neymar", "Raphinha"};
        int[] gols = {2, 1, 1, 3, 2, 2, 1};

        Map<String, Integer> totalGols = new HashMap<>();

        for (int i = 0; i < jogadores.length; i++) {
            totalGols.merge(jogadores[i], gols[i],(antigo, novo) -> antigo + novo);
        }

        String artilheiro = "";
        int golsArtilheiro = 0;


        for (Map.Entry<String, Integer> entry: totalGols.entrySet()) {
            if ( entry.getValue() > golsArtilheiro) {
                artilheiro = entry.getKey();
                golsArtilheiro = entry.getValue();
            }
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("Artilheiro: " + artilheiro + " (" + golsArtilheiro + " gols)");
    }
}
