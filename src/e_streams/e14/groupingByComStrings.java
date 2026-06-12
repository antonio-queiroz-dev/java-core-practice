package e_streams.e14;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByComStrings {
    // Agrupe os nomes pela primeira letra:
    static void main() {
        List<String> nomes = List.of("Ana", "André", "Bruno", "Bia", "Carlos", "Amanda");

        Map<Character, List<String>> resultado = nomes.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));

        System.out.println(resultado);

    }
}
