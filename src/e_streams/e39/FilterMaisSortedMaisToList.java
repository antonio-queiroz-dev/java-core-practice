package e_streams.e39;

import java.util.List;

public class FilterMaisSortedMaisToList {
    //Filtre as cidades com mais de 5 letras e devolva em ordem alfabética.
    static void main() {
        List<String> cidades = List.of("São Paulo", "Rio", "Salvador", "Recife", "Manaus", "Belém");

        List<String> resultado = cidades.stream()
                .filter(n -> n.length() > 5)
                .sorted()
                .toList();

        System.out.println(resultado);
    }
}
