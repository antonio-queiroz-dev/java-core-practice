package e_streams.e67;

import java.util.List;

public class FilterMaisReduceParaMenor {
    // Uma turma tirou as seguintes notas: {4.5, 7.0, 9.2, 3.8, 6.5, 8.1, 2.0, 5.5}. Filtre as notas acima de 5.0 (aprovados)
    // e use reduce pra encontrar a menor nota entre os aprovados.

    static void main() {
        List<Double> notas = List.of(4.5, 7.0, 9.2, 3.8, 6.5, 8.1, 2.0, 5.5);

        double resultado = notas.stream()
                .filter(n -> n > 5.0)
                .reduce((a, b) -> a < b ? a : b)
                .orElse(0.0);

        System.out.println(resultado);
    }
}
