package e_streams.e72;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMaisCounting {
    // Uma lista de frutas foi comprada no mês:
    // {"banana", "maçã", "banana", "uva", "maçã", "banana", "uva", "maçã", "maçã", "uva"}.
    // Agrupe por fruta e conte quantas vezes cada uma foi comprada.


    static void main() {
        List<String> frutas = List.of("banana", "maçã", "banana", "uva", "maçã", "banana", "uva", "maçã", "maçã", "uva");

        Map<String, Long> resultado = frutas.stream()
                .collect(Collectors.groupingBy(r -> r, Collectors.counting()));

        System.out.println(resultado);
    }
}
