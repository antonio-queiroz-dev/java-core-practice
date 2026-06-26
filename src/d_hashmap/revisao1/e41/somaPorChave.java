package d_hashmap.revisao1.e41;

import java.util.HashMap;
import java.util.Map;

public class somaPorChave {
    // O vendedor vendedores[i] fez uma venda de valores[i]. Some o total vendido por cada vendedor.

    static void main() {
        String[] vendedores = {"Ana", "Bruno", "Ana", "Carla", "Bruno", "Ana"};
        int[] valores = {100, 200, 150, 300, 50, 80};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < vendedores.length; i++) {
            if (map.containsKey(vendedores[i])) map.put(vendedores[i], map.get(vendedores[i]) + valores[i]);
            else map.put(vendedores[i], valores[i]);
        }

        System.out.println(map);
        map.clear();

        for (int i = 0; i < vendedores.length; i++) {
            map.merge(vendedores[i], valores[i] , (antigo, novo) -> antigo + novo );
        }

        System.out.println(map);

    }
}
