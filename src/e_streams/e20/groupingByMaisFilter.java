package e_streams.e20;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByMaisFilter {
    // Dada uma lista de números, filtre os positivos e agrupe em "Par" e "Ímpar":
    static void main() {
        List<Integer> numeros = List.of(5, -2, 8, -7, 3, 12, -1, 9, 4);

        Map<String,List<Integer>> imparPar = numeros.stream()
                .filter(n -> n > 0)
                .collect(Collectors.groupingBy(n -> n % 2 ==0 ? "Par" : "Impar"));
        System.out.println(imparPar);

    }
}
