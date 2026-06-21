package d_hashmap.revisao1.e40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agrupamento {
    // Agrupe os funcionários por setor:
    static void main() {
        String[] nomes = {"Ana", "Bruno", "Carla", "Daniel", "Eva"};
        String[] setores = {"Caixa", "Estoque", "Caixa", "Estoque", "Caixa"};
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < nomes.length; i++) {
            map.computeIfAbsent(setores[i],k -> new ArrayList<>()).add(nomes[i]);
        }

        System.out.println(map);
    }
}
