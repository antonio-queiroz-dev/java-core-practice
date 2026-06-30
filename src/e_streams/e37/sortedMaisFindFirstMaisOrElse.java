package e_streams.e37;

import java.util.List;

public class sortedMaisFindFirstMaisOrElse {
    // Encontre o menor número da lista usando stream.

    static void main() {
        List<Integer> numeros = List.of(45, 12, 78, 3, 56, 91);

        int resultado = numeros.stream()
                .sorted()
                .findFirst()
                .orElse(0);

        System.out.println(resultado);
    }
}
