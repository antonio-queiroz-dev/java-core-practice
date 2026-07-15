package e_streams.e49;

import java.util.List;

public class FilterMaisMapMaisSortedMaisToList {
    // Filtre os maiores que 10, multiplique cada um por 2, ordene do menor pro maior, e devolva em uma lista.

    static void main() {
        List<Integer> numeros = List.of(3, 15, 8, 22, 7, 30, 11, 4);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .sorted()
                .toList();

        System.out.println(resultado);
    }
}
