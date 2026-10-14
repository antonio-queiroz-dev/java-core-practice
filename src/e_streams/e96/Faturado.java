package e_streams.e96;

import java.util.List;

public class Faturado {
    // Calcule quanto a vendedora Ana faturou no total. O valor de cada venda é a quantidade multiplicada pelo valor unitário.

    static void main() {
        record Venda(String vendedor, String produto, int quantidade, double valorUnitario) {}

        List<Venda> vendas = List.of(
                new Venda("Ana", "Fone", 2, 200.00),
                new Venda("Bruno", "Teclado", 3, 90.00),
                new Venda("Ana", "Monitor", 1, 899.00),
                new Venda("Carla", "Mouse", 5, 129.50),
                new Venda("Ana", "Cabo", 4, 25.00)
        );

        double resultado = vendas.stream()
                .filter( v -> v.vendedor().equals("Ana"))
                .mapToDouble(v -> v.quantidade() * v.valorUnitario())
                .sum();

        System.out.println("Total faturado por Ana: " + resultado);
    }
}
