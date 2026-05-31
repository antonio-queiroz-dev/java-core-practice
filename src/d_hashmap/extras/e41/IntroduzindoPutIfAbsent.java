package d_hashmap.extras.e41;


// Dado um array de vendas, guarde apenas a primeira venda de cada vendedor:

import java.util.HashMap;
import java.util.Map;

public class IntroduzindoPutIfAbsent {
    static void main() {
        String[] vendedores = {"Ana", "Carlos", "Ana", "Maria", "Carlos", "Ana"};
        double[] valores = {150.0, 200.0, 80.0, 300.0, 120.0, 90.0};

        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < vendedores.length; i++) {
            map.putIfAbsent(vendedores[i],valores[i]);
        }

        System.out.println(map);
        
    }
}
