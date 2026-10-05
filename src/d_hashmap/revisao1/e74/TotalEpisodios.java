package d_hashmap.revisao1.e74;

// Um streaming registrou quantos episódios cada usuário assistiu por dia:
// {"Junior"-5, "Ana"-3, "Junior"-8, "Carlos"-6, "Ana"-7, "Junior"-4, "Carlos"-2, "Ana"-5}.
// Calcule o total de episódios assistidos por cada usuário. Depois, encontre quem assistiu mais.

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalEpisodios {
    public static void main(String[] args) {
        List<String> usuarios = List.of("Junior", "Ana", "Junior", "Carlos", "Ana", "Junior", "Carlos", "Ana");
        List<Integer> episodios = List.of(5, 3, 8, 6, 7, 4, 2, 5);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < usuarios.size(); i++) {
            map.merge(usuarios.get(i), episodios.get(i),(antigo, novo) -> antigo + novo);
        }

        int mais = 0;
        String maior = "";

        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            if (entry.getValue() > mais) {
                mais = entry.getValue();
                maior = entry.getKey();
            }
        }

        System.out.println("Total: " + map);
        System.out.println("Mais assistiu: " + maior + " (" + mais + " episódios)");
    }
}
