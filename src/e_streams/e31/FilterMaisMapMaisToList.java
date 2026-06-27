package e_streams.e31;

import java.util.List;

public class FilterMaisMapMaisToList {
    // Pegue só as frutas com mais de 4 letras e devolva uma lista com elas em MAIÚSCULAS.

    static void main() {
        List<String> frutas = List.of("banana", "uva", "maçã", "abacaxi", "kiwi");

        List<String> resultado = frutas.stream()
                .filter(n -> n.length() > 4)
                .map(n -> n.toUpperCase())
                .toList();

        System.out.println(resultado);
    }
}
