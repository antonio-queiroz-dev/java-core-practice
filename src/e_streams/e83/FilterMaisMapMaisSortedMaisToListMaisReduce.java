package e_streams.e83;

import java.util.List;

public class FilterMaisMapMaisSortedMaisToListMaisReduce {
    // Uma lista de pedidos tem os valores: {35.0, 150.0, 220.0, 80.0, 310.0, 95.0, 180.0}. Filtre os pedidos acima de R$100,
    // aplique frete de 10% (multiplique por 1.1), ordene do menor pro maior, imprima a lista,
    // e depois use reduce com valor inicial pra somar o total.


    static void main() {
        List<Double> list = List.of(35.0, 150.0, 220.0, 80.0, 310.0, 95.0, 180.0);

        List<Double> frete = list.stream()
                .filter(n -> n > 100)
                .map(n -> n * 1.1)
                .sorted()
                .toList();

        double total = frete.stream()
                .reduce(0.0, Double::sum);

        System.out.printf("Com frete: " + frete);
        System.out.println("Total: " + total);
    }
}
