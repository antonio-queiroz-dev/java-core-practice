package e_streams.e46;

import java.util.List;
import java.util.stream.Collectors;

public class Combinacao {
    // Dada uma lista de nomes, filtre os que têm mais de 4 letras, ordene alfabeticamente, e devolva uma única String separada por " - ".
    static void main() {
        List<String> nomes = List.of("Ana", "Pedro", "Bia", "Carlos", "Lucas", "Rui");

        String resultado = nomes.stream()
                .filter(n -> n.length() > 4)
                .sorted()
                .collect(Collectors.joining(" - "));

        System.out.println(resultado);
    }
}
