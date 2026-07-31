package e_streams.e60;

import java.util.List;

public class ReduceComSoma {
    // Some todas as parcelas usando reduce com valor inicial 0.

    static void main() {
        List<Integer> parcelas = List.of(150, 200, 80, 120, 250);

        long resultado = parcelas.stream()
                .reduce(0,(acumulador, atual) -> acumulador + atual);

        System.out.println(resultado);
    }
}
