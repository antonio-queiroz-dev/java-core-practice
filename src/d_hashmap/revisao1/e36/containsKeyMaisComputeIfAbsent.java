package d_hashmap.revisao1.e36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class containsKeyMaisComputeIfAbsent {
    // Agrupe números por faixa: "Baixo" (1-5), "Médio" (6-10), "Alto" (11+). Faz nas duas formas:

    static void main() {
        List<Integer> numeros = List.of(3, 8, 12, 1, 7, 15, 5, 10, 20);
        Map<String, List<Integer>> map = new HashMap<>();

        for(int n: numeros) {
            String faixa;
            if (n < 6) faixa = "Baixo";
            else if (n < 11) faixa = "Médio";
            else faixa = "Alto";

            map.computeIfAbsent(faixa, k -> new ArrayList<>()).add(n);

        }

        System.out.println(map);
    }
}
