package e_streams.e01;

import java.util.List;

public class FiltrarNumerosPares {
    static void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(pares);


    }


}
