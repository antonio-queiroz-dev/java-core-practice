package e_streams.e26;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByMaisContagem {
    // Conte quantos nomes começam com cada letra:

    static void main() {
        List<String> nomes = List.of("Ana", "André", "Bruno", "Bia", "Carlos", "Amanda", "Caio");
        Map<Character, Long> resultado = nomes.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0), Collectors.counting()));

        System.out.println(resultado);
    }
}
