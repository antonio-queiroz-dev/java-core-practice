package e_streams.e59;

import java.util.List;

public class ReduceMenorMaisFilter {
    // Filtre apenas os negativos e encontre o menor usando reduce.
    static void main() {
        List<Integer> numeros = List.of(12, -5, 8, -1, 20, 3, -9, 15);

        Integer resultado = numeros.stream()
                .filter(n -> n <0)
                .reduce((a,b) -> a < b ? a : b)
                .orElse(0);

        System.out.println(resultado);


    }
}
