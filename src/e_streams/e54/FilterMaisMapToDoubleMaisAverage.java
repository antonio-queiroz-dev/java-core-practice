package e_streams.e54;

import java.util.List;

public class FilterMaisMapToDoubleMaisAverage {
    // Calcule a média apenas dos aprovados (nota >= 7).
    static void main() {
        List<Integer> notas = List.of(5, 8, 3, 9, 7, 4, 10, 6);

        Double resultado = notas.stream()
                .filter(n -> n>= 7)
                .mapToDouble(n-> n)
                .average()
                .orElse(0);

        System.out.println(resultado);
    }
}
