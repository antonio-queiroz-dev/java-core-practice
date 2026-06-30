package e_streams.e38;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMaisMapMaisJoining {
    // Filtre os nomes que começam com "A" e junte-os separados por ", ".

    static void main() {
        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Amanda", "Beatriz");

        String resultado = nomes.stream()
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.joining(", "));

        System.out.println(resultado);
    }
}
