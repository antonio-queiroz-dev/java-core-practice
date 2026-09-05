package e_streams.e86;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByComTernarioMaisCounting {
    // Episódios por anime: {500, 37, 1100, 24, 25, 87, 37, 47}. Agrupe em "Longo" (>= 50 episódios)
    // e "Curto" (< 50) com groupingBy + ternário + counting.

    static void main() {
        List<Integer> episodios = List.of(500, 37, 1100, 24, 25, 87, 37, 47);

        Map<String, Long> resultado = episodios.stream()
                .collect(Collectors.groupingBy(e -> e >=50 ? "Longo":"Curto",Collectors.counting()));

        System.out.println(resultado);
    }
}
