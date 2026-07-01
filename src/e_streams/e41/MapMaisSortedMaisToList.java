package e_streams.e41;

import java.util.List;

public class MapMaisSortedMaisToList {
    //Transforme cada nome para primeira letra maiúscula (ex: "carlos" → "Carlos") e devolva em ordem alfabética.

    static void main() {
        List<String> nomes = List.of("carlos", "ana", "beatriz", "daniel");

        List<String> resultado = nomes.stream()
                .map(n -> n.substring(0,1).toUpperCase() + n.substring(1))
                .sorted()
                .toList();

        System.out.println(resultado);
    }
}
