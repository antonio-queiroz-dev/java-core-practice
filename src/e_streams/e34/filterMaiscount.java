package e_streams.e34;

import java.util.List;

public class filterMaiscount {
    // Conte quantos alunos foram aprovados (nota maior ou igual a 7). Imprima o total.

    static void main() {
        List<Integer> notas = List.of(8, 5, 10, 6, 7, 4, 9);

        long aprovados = notas.stream()
                .filter(n -> n >=7)
                .count();

        System.out.println("Aprovados: " + aprovados);
    }
}
