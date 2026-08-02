package e_streams.e61;

import java.util.List;

public class FilterMaisReduce {
    // Filtre os aprovados (>= 7) e encontre a maior nota entre eles usando reduce.
    static void main() {
        List<Integer> notas = List.of(5, 8, 3, 10, 6, 9, 4, 7);

        Integer resultado = notas.stream()
                .filter(n -> n >= 7)
                .reduce((a,b) -> a > b ? a : b)
                .orElse(0);

        System.out.println(resultado);
    }
}
