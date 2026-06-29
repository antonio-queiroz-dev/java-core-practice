package e_streams.e36;

import java.util.List;

public class filterMaisMapToIntMaisSum {
    //Some apenas os preços acima de 20. Imprima o total.

    static void main() {
        List<Integer> precos = List.of(15, 30, 8, 50, 12, 25);

        int resultado = precos.stream()
                .filter(n -> n > 20)
                .mapToInt(n -> n = n)
                .sum();

        System.out.println(resultado);
    }
}
