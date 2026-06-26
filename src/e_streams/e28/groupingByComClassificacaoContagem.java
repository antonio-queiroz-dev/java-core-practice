package e_streams.e28;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByComClassificacaoContagem {
    // Dada uma lista de idades, agrupe em "Menor" (< 18) e "Maior" (>= 18) e conte quantos em cada:

    static void main() {
        List<Integer> idades = List.of(15, 22, 17, 30, 12, 25, 16, 45);

        Map<String, Long> resultado = idades.stream()
                .collect(Collectors.groupingBy(n -> n < 18 ? "Menor" : "Maior", Collectors.counting()));

        System.out.println(resultado);
    }
}
