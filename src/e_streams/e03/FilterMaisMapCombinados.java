package e_streams.e03;

import java.util.List;

public class FilterMaisMapCombinados {
    //Dada uma lista de números, filtre os maiores que 5 e multiplique cada um por 2.
    static void main() {
        List<Integer> numeros = List.of(1, 3, 6, 8, 2, 10, 4, 7);

        List<Integer> multiplicarMaioresQuecinco = numeros.stream()
                .filter(n -> n> 5)
                .map(n -> n * 2)
                .toList();

        System.out.println(multiplicarMaioresQuecinco);
    }
}
