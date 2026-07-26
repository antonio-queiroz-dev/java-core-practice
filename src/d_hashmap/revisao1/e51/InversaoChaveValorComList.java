package d_hashmap.revisao1.e51;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InversaoChaveValorComList {
    // Inverta: crie um Map<String, List<String>> onde a chave é o setor e o valor é a lista de nomes. Use computeIfAbsent.

    static void main() {
        Map<String, String> funcionarios = Map.of("Ana", "TI", "Bruno", "RH", "Carla", "TI", "Daniel", "RH", "Eva", "TI");
        Map<String, List<String>> map = new HashMap<>();

        for (Map.Entry<String, String> entry: funcionarios.entrySet()) {
            map.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        System.out.println(map);
    }
}
