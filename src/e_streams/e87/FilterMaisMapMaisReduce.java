package e_streams.e87;

import java.util.List;

public class FilterMaisMapMaisReduce {
    //Notas de avaliação de animes: {6.5, 9.0, 7.2, 8.6, 5.5, 9.1, 8.3}. Filtre as notas acima de 7.0, aplique uma penalidade
    // de 10% (multiplique por 0.9), e use reduce sem valor inicial pra encontrar a menor nota após a penalidade.


    static void main() {
        List<Double> avaliacao = List.of(6.5, 9.0, 7.2, 8.6, 5.5, 9.1, 8.3);

        double resultado = avaliacao.stream()
                .filter(n-> n>7.0)
                .map(n-> n * 0.9)
                .reduce((a,b) -> a<b ? a:b)
                .orElse(0.0);

        System.out.println("Menor nota com penalidade: " + resultado);
    }
}
