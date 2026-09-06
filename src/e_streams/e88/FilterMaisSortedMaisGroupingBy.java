package e_streams.e88;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMaisSortedMaisGroupingBy {
    // Notas de episódios de uma temporada: {5.0, 8.5, 7.0, 9.5, 6.0, 4.5, 8.0, 3.5, 7.5}. Filtre as notas acima de 5.0,
    // depois agrupe em "Ótimo" (>= 8.0) e "Bom" (< 8.0) com groupingBy + ternário + counting.

    static void main() {
        List<Double> notas = List.of(5.0, 8.5, 7.0, 9.5, 6.0, 4.5, 8.0, 3.5, 7.5);

        Map<String, Long> resultado = notas.stream()
                .filter(n -> n > 5.0)
                .collect(Collectors.groupingBy(n-> n>=8.0 ? "Ótimo":"Bom",Collectors.counting()));

        System.out.println(resultado);
    }
}
