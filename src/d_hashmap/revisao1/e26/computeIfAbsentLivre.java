package d_hashmap.revisao1.e26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class computeIfAbsentLivre {
    // Agrupe os alunos pela primeira letra do nome:
    static void main() {
        List<String> alunos = List.of("Ana", "André", "Bruno", "Bia", "Carlos", "Amanda", "Caio");

        Map<Character, List<String>> map = new HashMap<>();

        for (String n: alunos) {
            map.computeIfAbsent(n.charAt(0),k -> new ArrayList<>()).add(n);
        }
        System.out.println(map);
    }
}
