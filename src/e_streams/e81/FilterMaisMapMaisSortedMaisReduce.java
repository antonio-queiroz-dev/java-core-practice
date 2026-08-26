package e_streams.e81;

import java.util.List;

public class FilterMaisMapMaisSortedMaisReduce {
    // Um time de vendedores fez as seguintes vendas no mês: {800.0, 2500.0, 1200.0, 3000.0, 600.0, 1800.0, 450.0}.
    // Filtre quem vendeu acima de R$1000, aplique uma comissão de 5% (multiplique por 0.05), ordene as comissões do menor pro maior,
    // imprima a lista, e use reduce com valor inicial pra somar o total de comissões.

    public static void main(String[] args) {
        List<Double> vendas = List.of(800.0, 2500.0, 1200.0, 3000.0, 600.0, 1800.0, 450.0);

        List<Double> comissoes  = vendas.stream()
                .filter(v -> v > 1000)
                .map(v -> v * 0.05)
                .sorted()
                .toList();

        System.out.println("Comissoes: "+comissoes );

        double total = comissoes.stream()
                .reduce(0.0, Double::sum);
        System.out.println("Total: " + total);
    }
}
