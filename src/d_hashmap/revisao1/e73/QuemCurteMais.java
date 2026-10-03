package d_hashmap.revisao1.e73;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuemCurteMais {
    //Um fórum registrou os gêneros favoritos dos usuários:
    // {"Junior"-"Isekai", "Ana"-"Ação", "Carlos"-"Isekai", "Junior"-"Mistério", "Ana"-"Isekai", "Carlos"-"Ação", "Junior"-"Ação", "Ana"-"Comédia"}.
    // Agrupe quais gêneros cada usuário curte. Depois, imprima quem curte mais gêneros.

    static void main() {
        List<String> nomes = List.of("Junior", "Ana", "Carlos", "Junior", "Ana", "Carlos", "Junior", "Ana");
        List<String> generos = List.of("Isekai", "Ação", "Isekai", "Mistério", "Isekai", "Ação", "Ação", "Comédia");

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < nomes.size(); i++) {
            map.computeIfAbsent(nomes.get(i), k -> new ArrayList<>()).add(generos.get(i));
        }

        List<String> maisFrequente = new ArrayList<>();
        int mais = 0;

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            int quantGenero = entry.getValue().size();

            if (quantGenero > mais) {
                mais = quantGenero;
                maisFrequente.clear();
                maisFrequente.add(entry.getKey());
            } else if (quantGenero == mais) {
                maisFrequente.add(entry.getKey());
            }
        }

        System.out.println(map);
        System.out.println(maisFrequente + ": " + mais + " vezes");
    }
}
