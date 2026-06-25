package e_streams.e27;

import java.util.List;

public class filterMaisMapToIntMaisAverage {
    // Dada uma lista de notas, calcule a média só das notas de aprovados (>= 7):
    static void main() {
        List<Double> notas = List.of(8.5, 5.0, 9.2, 6.5, 7.0, 4.3, 8.0);

        double media = notas.stream()
                .filter(n -> n >= 7)
                .mapToDouble(n -> n )
                .average()
                .orElse(0);

        System.out.println("Média dos aprovados: " + media);
    }
}
