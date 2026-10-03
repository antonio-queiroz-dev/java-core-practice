package e_streams.e91;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaiorParaMenor {
    //Streams revisão e91
    //
    //Uma lista de animes tem suas notas: {7.2, 9.0, 5.5, 8.6, 6.0, 9.1, 4.5, 8.3}. Filtre os que têm nota acima de 7.0,
    // ordene do maior pro menor, e junte os valores numa String separada por " > ".

    static void main() {
        List<Double> notas = List.of(7.2, 9.0, 5.5, 8.6, 6.0, 9.1, 4.5, 8.3);

        String resultado = notas.stream()
                .filter(n -> n > 7.0)
                .sorted(Comparator.reverseOrder())
                .map(n -> n.toString())
                .collect(Collectors.joining(" > "));

        System.out.println(resultado);
    }
}
