package hashmapExtras.h8;

import java.util.HashMap;

public class SomaVendasPorVendedor {
    static void main() {
        String[] vendedores = {"Ana", "Carlos", "Ana", "Maria", "Carlos", "Ana"};
        double[] valores = {150.0, 200.0, 80.0, 300.0, 120.0, 90.0};

        HashMap<String, Double> map = new HashMap<>();

        for (int i = 0; i < valores.length; i++) {
            if (map.containsKey(vendedores[i])) {
                map.put(vendedores[i],map.get(vendedores[i])+ valores[i]);
            } else map.put(vendedores[i],valores[i]);
        }
        System.out.println(map);
    }
}
