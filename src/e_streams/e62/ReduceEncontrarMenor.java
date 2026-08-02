package e_streams.e62;

import java.util.List;

public class ReduceEncontrarMenor {
    // Uma academia registrou os tempos (em segundos) dos alunos numa corrida de 100m: {12.5, 11.8, 13.2, 11.1, 12.0, 14.3}.
    // Use reduce pra encontrar o menor tempo (o mais rápido).

    static void main() {
        List<Double> tempos = List.of(12.5, 11.8, 13.2, 11.1, 12.0, 14.3);

        Double resultado = tempos.stream()
                .reduce((a,b) -> a < b ? a : b)
                .orElse(0.0);

        System.out.println("Menor tempo: " + resultado + "s");
    }
}
