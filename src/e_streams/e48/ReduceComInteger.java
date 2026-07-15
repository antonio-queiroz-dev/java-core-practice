package e_streams.e48;

import java.util.List;

public class ReduceComInteger {
    // Encontre a maior temperatura usando reduce.

    static void main() {
        List<Integer> temperaturas = List.of(28, 35, 22, 40, 31, 19);

        Integer resultado = temperaturas.stream()
                .reduce((v1, v2) -> v1 > v2 ? v1 : v2)
                .orElse(0);

        System.out.println(resultado);
    }
}
