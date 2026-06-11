package e_streams.e08;

import java.util.List;

public class findFirst {
    // Dada uma lista de números, encontre o primeiro número maior que 50.
    static void main() {
        List<Integer> numeros = List.of(10, 25, 30, 55, 80, 42);

        int resultado = numeros.stream()
                .filter(n -> n >50)
                .findFirst()
                .orElse(0);

        System.out.println(resultado);

    }
}
