package d_hashmap.revisao1.e54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InversaoChaveValor {
    // Um professor guardou as notas finais dos alunos: {"Lucas"=8, "Maria"=10, "João"=7, "Ana"=10, "Pedro"=8}.
    // Inverta o mapa para que a nota seja a chave e o valor seja uma lista dos alunos que tiraram aquela nota.

    static void main() {
        Map<String, Integer> notas = Map.of("Lucas", 8, "Maria", 10, "João", 7, "Ana", 10, "Pedro", 8);

        Map<Integer, List<String>> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            map.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        System.out.println(map);
    }


}
