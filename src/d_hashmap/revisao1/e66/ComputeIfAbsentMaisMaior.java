package d_hashmap.revisao1.e66;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentMaisMaior {
    //Um mercado registrou os valores das compras por cliente:
    // {"Ana"-85.0, "Carlos"-120.0, "Ana"-200.0, "Carlos"-45.0, "Ana"-60.0, "Maria"-150.0, "Carlos"-90.0, "Maria"-70.0}.
    // Agrupe os valores por cliente numa List (usando computeIfAbsent). Depois, encontre a maior compra de cada cliente.

    static void main() {
        List<String> nomes = List.of("Ana", "Carlos", "Ana", "Carlos", "Ana", "Maria", "Carlos", "Maria");
        List<Double> valores = List.of(85.0, 120.0, 200.0, 45.0, 60.0, 150.0, 90.0, 70.0);

        Map<String,List<Double>> map = new HashMap<>();

        for (int i = 0; i < nomes.size(); i++) {
            map.computeIfAbsent(nomes.get(i), k-> new ArrayList<>()).add(valores.get(i));
        }

        System.out.println("Compras: " + map);
        for (Map.Entry<String, List<Double>> entry: map.entrySet()) {

            List<Double> values = entry.getValue();
            String maiorComprador = "";
            double maiorValor = 0;

            for (double v: values) {
                if (v > maiorValor) {
                    maiorValor = v;
                }
            }

            System.out.println("Maior compra - " + entry.getKey() + ": " + maiorValor);

        }

    }
}
