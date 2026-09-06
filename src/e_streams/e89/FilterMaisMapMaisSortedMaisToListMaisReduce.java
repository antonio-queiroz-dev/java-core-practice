package e_streams.e89;

import java.util.Comparator;
import java.util.List;

public class FilterMaisMapMaisSortedMaisToListMaisReduce {
    //Notas de avaliação de animes: {7.0, 5.5, 9.0, 6.5, 8.5, 4.0, 8.0, 3.5}. Filtre as acima de 6.0, aplique um bônus de 5%
    // (multiplique por 1.05), ordene do maior pro menor, imprima a lista, e use reduce sem valor inicial pra encontrar o menor valor com bônus.

    static void main() {
        List<Double> notas = List.of(7.0, 5.5, 9.0, 6.5, 8.5, 4.0, 8.0, 3.5);

        List<Double> lista = notas.stream()
                .filter(n -> n> 6.0)
                .map(n-> n * 1.05)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Com bônus: " + lista);

        double menorValor = lista.stream()
                .reduce((a,b) -> a<b ? a:b)
                .orElse(0.0);

        System.out.println("Menor com bônus: " + menorValor);
    }
}
