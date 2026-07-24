package e_streams.e53;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMaisSortedMaisMapMaisJoining {
    //Filtre os aprovados (nota >= 7), ordene do maior pro menor, transforme cada nota em String, e junte com " > ".

    static void main() {
        List<Integer> notas = List.of(4, 9, 6, 10, 3, 8, 7);

        String resultado = notas.stream()
                .filter(n -> n >= 7)
                .sorted(Comparator.reverseOrder())
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(" > "));

        System.out.println(resultado);
    }
}
