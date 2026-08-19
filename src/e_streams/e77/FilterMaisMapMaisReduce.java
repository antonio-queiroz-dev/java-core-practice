package e_streams.e77;

import java.util.List;

public class FilterMaisMapMaisReduce {
    // Uma empresa tem os salários: {1500.0, 3200.0, 4800.0, 2100.0, 5500.0, 1800.0}.
    // Filtre quem ganha menos de R$3000, aplique um reajuste de 15% (multiplique por 1.15)
    // , e use reduce com valor inicial pra somar o total dos salários reajustados.

    static void main() {
        List<Double> salarios = List.of(1500.0, 3200.0, 4800.0, 2100.0, 5500.0, 1800.0);

        Double resultado = salarios.stream()
                .filter(s -> s < 3000)
                .map(s -> s * 1.15)
                .reduce(0.0,(a,b) -> a + b);

        System.out.println("Total reajustado: R$" + resultado);

    }
}
