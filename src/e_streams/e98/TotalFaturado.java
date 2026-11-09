package e_streams.e98;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalFaturado {
    // Descubra o total faturado por cada vendedor.

    static void main() {
        record Venda(String vendedor, String produto, int quantidade, double valorUnitario) {
        }

        List<Venda> vendas = List.of(
                new Venda("Ana", "Fone", 2, 200.00),
                new Venda("Bruno", "Teclado", 3, 90.00),
                new Venda("Ana", "Monitor", 1, 899.00),
                new Venda("Carla", "Mouse", 5, 129.50),
                new Venda("Ana", "Cabo", 4, 25.00),
                new Venda("Bruno", "Mesa", 2, 450.00)
        );

        Map<String, Double> resultado = vendas.stream()
                .collect(Collectors.groupingBy(
                        v -> v.vendedor(),
                        Collectors.summingDouble(v -> v.quantidade() * v.valorUnitario)
                ));

        System.out.println(resultado);
    }
}
