package e_streams.e76;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMaisCountingMaisMaior {
    // Uma pizzaria registrou os pedidos:
    // {"Margherita", "Calabresa", "Portuguesa", "Margherita", "Calabresa", "Margherita", "Portuguesa", "Calabresa", "Calabresa"}.
    // Agrupe e conte com groupingBy + counting. Depois, percorra o resultado com for + entrySet pra encontrar o sabor mais pedido.

    static void main() {
        List<String> pedidos = List.of("Margherita", "Calabresa", "Portuguesa", "Margherita", "Calabresa", "Margherita", "Portuguesa", "Calabresa", "Calabresa");

        Map<String, Long> maisPedido = pedidos.stream()
                .collect(Collectors.groupingBy(p -> p , Collectors.counting()));

        long maior = 0;
        String mais = "";

        for (Map.Entry<String, Long> entry : maisPedido.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
                mais = entry.getKey();
            }
        }

        System.out.println("Pedidos: " + maisPedido);
        System.out.println("Mais pedido: " + mais + " (" + maior + "pedidos)");
    }
}
