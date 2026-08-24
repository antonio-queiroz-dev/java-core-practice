package e_streams.e79;

import java.util.List;

public class FilterMaisMapMaisReduce {
    // Uma loja tem os preços de produtos: {89.90, 250.0, 45.50, 320.0, 150.0, 75.0, 410.0}.
    // Filtre os que custam mais de R$100, aplique um desconto de 20% (multiplique por 0.8),
    // e use reduce sem valor inicial pra encontrar o menor preço depois do desconto.

    static void main() {
        List<Double> produtos = List.of(89.90, 250.0, 45.50, 320.0, 150.0, 75.0, 410.0);

        double resultado = produtos.stream()
                .filter(p -> p > 100)
                .map(p -> p *0.80)
                .reduce((a,b) -> a<b ? a:b)
                .orElse(0.0);

        System.out.println("Menor preço com desconto: " + resultado);
    }
}
