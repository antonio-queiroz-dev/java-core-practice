package d_hashmap.revisao1.e03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoComList {
    static void main() {
        Map<String, String> alunos = new HashMap<>();
        alunos.put("Ana", "A");
        alunos.put("Carlos", "B");
        alunos.put("Maria", "A");
        alunos.put("João", "B");
        alunos.put("Pedro", "A");

        HashMap<String, List<String>> map = new HashMap<>();

        for (Map.Entry<String, String> entry : alunos.entrySet()) {
            if (map.containsKey(entry.getValue())) {
                map.get(entry.getValue()).add(entry.getKey());
            } else {
                List<String> nomes = new ArrayList<>();
                nomes.add(entry.getKey());
                map.put(entry.getValue(), nomes);
            }
        }

        System.out.println(map);
    }
}
