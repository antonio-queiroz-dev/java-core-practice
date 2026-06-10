package e_streams.e06;

import java.util.List;
import java.util.stream.Collectors;

public class MapMaisCollectJoining {
    // Dada uma lista de nomes, pegue os que têm mais de 3 letras,
    // transforme em maiúsculo, e junte numa String separada por vírgula.

    static void main() {
        List<String> nomes = List.of("ana", "lu", "carlos", "jo", "maria", "pedro");

        String resultado = nomes.stream()
                .filter(n -> n.length() > 3)
                .map(n -> n.toUpperCase())
                .collect(Collectors.joining(", "));
        
        System.out.println(resultado);
    }
}
