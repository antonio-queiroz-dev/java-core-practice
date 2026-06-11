package e_streams.e10;

import java.util.List;

public class distinct {
    // Dada uma lista com números repetidos, remova as duplicatas e retorne em ordem crescente.
    static void main() {
        List<Integer> numeros = List.of(5, 3, 5, 1, 3, 8, 1, 8, 2);

        List<Integer> resultado = numeros.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(resultado);
    }
}
