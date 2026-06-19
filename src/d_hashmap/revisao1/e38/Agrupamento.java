package d_hashmap.revisao1.e38;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agrupamento {
    // Agrupe os nomes por tamanho. Faz com containsKey E com computeIfAbsent:

    static void main() {
        List<String> nomes = List.of("Ana", "Carlos", "Lu", "Maria", "Jo", "Pedro");

        Map<Integer, List<String>> map = new HashMap<>();

        for (String n : nomes) {
            if (map.containsKey(n.length())) {
                map.get(n.length()).add(n);
            } else {
                List<String> list = new ArrayList<>();
                list.add(n);
                map.put(n.length(), list);
            }
        }

        System.out.println(map);
        map.clear();

        for (String n : nomes) {
            map.computeIfAbsent(n.length(), k -> new ArrayList<>()).add(n);
        }

        System.out.println(map);
    }
}
