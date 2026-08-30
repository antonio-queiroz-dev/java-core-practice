package d_hashmap.revisao1.e71;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeContagemMaisFiltroMaisMaior {
    //Um site de streaming registrou quais animes foram assistidos:
    // {"Naruto", "Death Note", "Naruto", "One Piece", "Death Note", "Naruto", "Spy x Family", "One Piece", "Death Note", "Naruto"}.
    // Conte com merge + Integer::sum. Filtre os que foram assistidos 3 ou mais vezes. Encontre o mais assistido.

    static void main() {
        List<String> animes = List.of("Naruto", "Death Note", "Naruto", "One Piece", "Death Note", "Naruto", "Spy x Family", "One Piece", "Death Note", "Naruto");

        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> maisDeTres = new HashMap<>();


        // formato mais verboso
        for (String a: animes) {
            if (map.containsKey(a)) {
                map.put(a,map.get(a)+1);
            } else {
                map.put(a,1);
            }
        }
        System.out.println(map);
        map.clear();


        // formato mais moderno
        for (String a: animes) {
            map.merge(a,1,(antigo,novo)-> antigo + novo);
        }

        int maior = 0;
        String mais = "";

        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            if (entry.getValue() >= 3){
                maisDeTres.put(entry.getKey(), entry.getValue());
            }

            if (entry.getValue()> maior) {
                maior = entry.getValue();
                mais = entry.getKey();
            }
        }

        System.out.println("Todos: " + map);
        System.out.println("3+ vezes: " + maisDeTres);
    }

}

