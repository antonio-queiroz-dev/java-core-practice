package e_streams.e35;

import java.util.List;

public class mapToDoubleMaisAverage {
    // Calcule a média das idades usando stream. Imprima.

    static void main() {
        List<Integer> idades = List.of(20, 25, 30, 22, 28);

        double media = idades.stream()
                .mapToDouble(n -> n = n)
                .average()
                .orElse(0);

        System.out.println(media);
    }
}
