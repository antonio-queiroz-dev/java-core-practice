package e_streams.e25;

import java.util.List;
import java.util.stream.Collectors;

public class filterMaisMapMaisJoining {
    // Dada uma lista de nomes, filtre os que começam com "M", transforme em minúsculo, e junte separado por " - ":
    static void main() {
        List<String> nomes = List.of("Maria", "Carlos", "Marcos", "Ana", "Miguel", "Pedro");
        String resultado = nomes.stream()
                .filter(n -> n.startsWith("M"))
                .map(n -> n.toLowerCase())
                .collect(Collectors.joining(" - "));

        System.out.println(resultado);
    }
}
