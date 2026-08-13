package e_streams.e74;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMaisCounting {
    // Uma lanchonete registrou os pedidos do dia:
    // {"X-Burger", "Açaí", "X-Burger", "Suco", "Açaí", "X-Burger", "Suco", "Suco", "Açaí", "X-Burger"}.
    // Agrupe por item e conte quantos de cada foram pedidos. Sem consultar.

    static void main() {
        List<String> pedidos = List.of("X-Burger", "Açaí", "X-Burger", "Suco", "Açaí", "X-Burger", "Suco", "Suco", "Açaí", "X-Burger");

        Map<String, Long> resultado = pedidos.stream()
                .collect(Collectors.groupingBy(r -> r, Collectors.counting()));

        System.out.println(resultado);
    }
}
