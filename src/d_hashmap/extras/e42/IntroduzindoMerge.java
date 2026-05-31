package d_hashmap.extras.e42;

import java.util.HashMap;
import java.util.Map;

public class IntroduzindoMerge {
    static void main() {
        String[] vendedores = {"Ana", "Carlos", "Ana", "Maria", "Carlos", "Ana"};
        double[] valores = {150.0, 200.0, 80.0, 300.0, 120.0, 90.0};

        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < vendedores.length; i++) {
            map.merge(vendedores[i], valores[i], (antigo, novo) -> antigo + novo);
        }

        System.out.println(map);
    }
}
