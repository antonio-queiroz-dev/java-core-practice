package e_streams.e71;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMaiscounting {
    // Uma loja registrou as categorias dos produtos vendidos:
    // {"Eletrônicos", "Roupas", "Eletrônicos", "Alimentos", "Roupas", "Roupas", "Alimentos", "Eletrônicos", "Alimentos", "Alimentos"}.
    // Agrupe por categoria e conte quantos produtos de cada foram vendidos.


    static void main() {
        List<String> categorias = List.of("Eletrônicos", "Roupas", "Eletrônicos", "Alimentos", "Roupas", "Roupas", "Alimentos", "Eletrônicos", "Alimentos", "Alimentos");

        Map<String, Long> cat = categorias.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(cat);
    }
}
