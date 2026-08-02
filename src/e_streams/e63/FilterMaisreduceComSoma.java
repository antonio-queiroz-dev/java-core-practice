package e_streams.e63;

import java.util.List;

public class FilterMaisreduceComSoma {
    //Uma loja de eletrônicos tem os preços: {150.0, 89.90, 299.99, 45.50, 120.0, 75.0}. Filtre os produtos que custam
    // mais de R$100 e use reduce pra somar o total deles.

    static void main() {
        List<Double> precos = List.of(150.0, 89.90, 299.99, 45.50, 120.0, 75.0);

        Double resultado = precos.stream()
                .filter(n -> n > 100)
                .reduce(0.0,(a,b) -> a + b);

        System.out.println("Total dos produtos acima de R$100: R$" + resultado);
    }
}
