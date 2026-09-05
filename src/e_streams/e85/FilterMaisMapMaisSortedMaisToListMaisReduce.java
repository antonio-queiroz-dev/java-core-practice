package e_streams.e85;

import java.util.List;

public class FilterMaisMapMaisSortedMaisToListMaisReduce {
    // Uma loja tem os preços: {25.0, 130.0, 85.0, 200.0, 60.0, 175.0, 40.0, 310.0}.
    // Filtre os acima de R$100, aplique desconto de 25% (multiplique por 0.75), ordene do menor pro maior, imprima a lista,
    // e depois use reduce sem valor inicial pra encontrar o maior preço com desconto.

    static void main() {
        List<Double> precos = List.of(25.0, 130.0, 85.0, 200.0, 60.0, 175.0, 40.0, 310.0);

        List<Double> lista = precos.stream()
                .filter(n -> n >100)
                .map(n -> n * 0.75)
                .sorted()
                .toList();

        System.out.println("Com desconto: " + lista);

        double maior = lista.stream()
                .reduce((a,b)-> a > b ? a:b)
                .orElse(0.0);

        System.out.println("Maior com desconto: " + maior);
    }
}
