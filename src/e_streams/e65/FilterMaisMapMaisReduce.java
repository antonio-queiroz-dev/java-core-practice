package e_streams.e65;

import java.util.List;

public class FilterMaisMapMaisReduce {
    // Uma empresa tem os salários dos funcionários: {2500.0, 4800.0, 3200.0, 7500.0, 1800.0, 6000.0}.
    // Filtre quem ganha acima de R$3000, aplique um bônus de 10% (multiplique por 1.1) e use reduce pra somar o total com bônus.

    static void main() {
        List<Double> salarios = List.of(2500.0, 4800.0, 3200.0, 7500.0, 1800.0, 6000.0);

        double resultado = salarios.stream()
                .filter(n -> n > 3000)
                .map(n -> n * 1.1)
                .reduce(0.0,(a,b) -> a +b);

        System.out.println("Total com bônus: R$" + resultado);
    }

}
