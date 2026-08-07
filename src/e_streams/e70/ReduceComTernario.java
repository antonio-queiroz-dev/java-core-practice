package e_streams.e70;

import java.util.List;

public class ReduceComTernario {
    // Uma lista de jogadores tem suas pontuações: {320, 150, 480, 90, 210, 550, 175}.
    // Filtre quem fez mais de 200 pontos e use reduce sem valor inicial pra encontrar a maior pontuação entre eles.

    static void main() {
        List<Integer> pontuacoes = List.of(320, 150, 480, 90, 210, 550, 175);

        int maior = pontuacoes.stream()
                .filter(n -> n > 200)
                .reduce(0,(a,b) -> a > b ? a: b);

        System.out.println(maior);
    }
}
