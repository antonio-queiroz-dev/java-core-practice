package e_streams.e84;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMaisGroupingByMaisCounting {
    // Notas de uma turma: {3.0, 7.5, 8.0, 4.5, 6.0, 9.0, 5.5, 6.5}. Primeiro filtre as notas acima de 4.0,
    // depois agrupe em "Aprovado" (>= 6.0) e "Recuperação" (< 6.0) com groupingBy + ternário + counting.

    public static void main(String[] args) {
        List<Double> notas = List.of(3.0, 7.5, 8.0, 4.5, 6.0, 9.0, 5.5, 6.5);
        Map<String, Long> resultado = notas.stream()
                .filter(n-> n > 4.0)
                .collect(Collectors.groupingBy(n-> n >= 6.0 ? "Aprovado":"Reprovado",Collectors.counting()));

        System.out.println(resultado);
    }
}
