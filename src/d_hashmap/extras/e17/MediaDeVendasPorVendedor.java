package hashmapExtras.h17;

import java.util.HashMap;
import java.util.Map;

public class MediaDeVendasPorVendedor {
    static void main() {
        String[] vendedores = {"Ana", "Carlos", "Ana", "Maria", "Carlos", "Ana", "Maria"};
        double[] valores = {150.0, 200.0, 80.0, 300.0, 120.0, 90.0, 250.0};

        HashMap<String, Double> total = new HashMap<>();
        HashMap<String, Double> quantidade = new HashMap<>();

        for (int i = 0; i < vendedores.length; i++) {
            if (quantidade.containsKey(vendedores[i])) {
                quantidade.put(vendedores[i], quantidade.get(vendedores[i]) + 1);
            } else quantidade.put(vendedores[i], 1.0);
            if (total.containsKey(vendedores[i])) {
                total.put(vendedores[i], total.get(vendedores[i]) + valores[i]);
            } else total.put(vendedores[i], valores[i]);
        }

        for (Map.Entry<String, Double> entry : total.entrySet()) {
            double media = entry.getValue() / quantidade.get(entry.getKey());
            System.out.println(entry.getKey() + " - " + media);
        }

    }

}
