package e_streams.e16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByComClassificação {
    // Dada uma lista de notas, agrupe em "Aprovado" (>= 7) e "Reprovado" (< 7):
    static void main() {
        List<Double> notas = List.of(8.5, 5.0, 9.2, 6.5, 7.0, 4.3);

        Map<String, List<Double>> resultado = notas.stream()
                .collect(Collectors.groupingBy(n -> n >= 7 ? "Aprovado" : "Reprovado"));

        System.out.println(resultado);
    }
}
