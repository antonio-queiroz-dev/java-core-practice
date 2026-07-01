package e_streams.e40;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByComTernario {
    //Agrupe as idades em "Menor" (abaixo de 18) e "Maior" (18 ou mais). Use groupingBy com ternário no lambda.

    static void main() {
        List<Integer> idades = List.of(15, 22, 17, 30, 12, 19, 25);

        Map<String, List<Integer>> resultado = idades.stream()
                .collect(Collectors.groupingBy(n -> n < 18 ? "Menor" : "Maior"));

        System.out.println(resultado);
    }
}
