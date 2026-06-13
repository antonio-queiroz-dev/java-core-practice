package e_streams.e17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class filterMaisGroupingByCombinados {
    // Dada uma lista de números, filtre só os positivos e agrupe em "Par" e "Ímpar":
    static void main() {
        List<Integer> numeros = List.of(-3, 4, 7, -1, 2, 9, -5, 6, 1, 8);

        Map<String, List<Integer>> resultado = numeros.stream()
                .filter(n -> n> 0)
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Par" : "Impar"));

        System.out.println(resultado);
    }
}
