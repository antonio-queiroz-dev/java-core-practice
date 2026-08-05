package d_hashmap.revisao1.e58;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeParaContagem {
    //Uma votação registrou os votos dos funcionários para o sabor do bolo da festa:
    // {"chocolate", "morango", "chocolate", "baunilha", "morango", "chocolate", "baunilha", "morango", "morango"}.
    // Conte os votos de cada sabor usando merge. Depois, encontre o sabor vencedor.

    static void main() {
        List<String> votos = List.of("morango", "chocolate", "baunilha", "morango", "chocolate", "baunilha", "morango", "morango");
        Map<String, Integer> map = new HashMap<>();

        for (String v: votos) {
            map.merge(v,1,(antigo, novo) -> antigo + novo);
        }

        int maisVoto = 0;
        String maisvotado = "";

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maisVoto) {
                maisVoto = entry.getValue();
                maisvotado = entry.getKey();
            }
        }

        System.out.println("Votos: " + map);
        System.out.println("Vencedor: " + maisvotado + " (" + maisVoto + " votos)" );
    }
}
