package e_streams.e75;

import java.util.List;

public class FilterMaisReduce {
    // Uma turma de alunos tirou as notas: {6.5, 3.0, 8.5, 7.0, 4.5, 9.0, 5.0, 2.5}.
    // Filtre os aprovados (nota >= 6.0) e use reduce sem valor inicial pra encontrar a maior nota entre eles.

    static void main() {
        List<Double> notas = List.of(6.5, 3.0, 8.5, 7.0, 4.5, 9.0, 5.0, 2.5);

        double maiorNota = notas.stream()
                .filter(n -> n > 6.0)
                .reduce((a,b) -> a > b ? a : b)
                .orElse(0.0);

        System.out.println("Maior nota entre aprovados:" + maiorNota);
    }
}
