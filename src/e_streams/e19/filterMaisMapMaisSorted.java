package e_streams.e19;

import java.util.List;

public class filterMaisMapMaisSorted {
    // Dada uma lista de nomes, filtre os que têm mais de 3 letras, transforme em maiúsculo,
    // e ordene alfabeticamente.

    static void main() {
        List<String> nomes = List.of("ana", "lu", "carlos", "jo", "maria", "pedro", "bia");

        List<String> resultado = nomes.stream()
                .filter(n -> n.length() >3)
                .map(n -> n.toUpperCase())
                .sorted()
                .toList();

        System.out.println(resultado);
    }
}
