package e_streams.e05;

import java.util.List;

public class SortedMaisToList {
    //Dada uma lista de números, filtre os ímpares e retorne em ordem crescente.
    static void main() {
        List<Integer> numeros = List.of(9, 2, 7, 4, 1, 8, 3, 6, 5);

        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .toList();

        System.out.println(numerosImpares);
    }
}
