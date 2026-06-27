package e_streams.e32;

import java.util.List;

public class MapToIntMaisSum {
    // Some todos os preços usando stream. Imprima o total.

    static void main() {
        List<Integer> precos = List.of(12, 8, 25, 40, 5);

        int resultado = precos.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(resultado);
    }
}
