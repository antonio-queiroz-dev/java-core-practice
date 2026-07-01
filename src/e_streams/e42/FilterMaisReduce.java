package e_streams.e42;

import java.util.List;

public class FilterMaisReduce {
    // Filtre os números pares e some-os usando reduce.

    static void main() {
        List<Integer> numeros = List.of(10, 15, 20, 25, 30, 35, 40);

        long pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0,(acumulador, elemento) -> acumulador + elemento);

        System.out.println(pares );

    }
}
