package e_streams.e22;

import java.util.Comparator;
import java.util.List;

public class filterMaisSortedMaisToList {
    // Dada uma lista de números, filtre os maiores que 10, ordene em ordem decrescente, e colete numa lista:
    static void main() {
        List<Integer> numeros = List.of(5, 25, 3, 18, 7, 30, 12, 1);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n >10)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(resultado);
    }
}
