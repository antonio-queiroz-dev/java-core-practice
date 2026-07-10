package e_streams.e44;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedReverseOrderMaisMapMaisJoining {
    // Ordene do maior pro menor, transforme cada número em String, e junte com " > ".
    static void main() {
        List<Integer> pontuacoes = List.of(85, 92, 78, 95, 88);

        String resultado = pontuacoes.stream()
                .sorted(Comparator.reverseOrder())
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining( " > "));

        System.out.println(resultado);
    }
}
