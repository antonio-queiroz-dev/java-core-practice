package e_streams.e33;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByMaisCounting {
    // Agrupe as palavras pela quantidade de letras e conte quantas há em cada grupo.

    static void main() {
        List<String> palavras = List.of("oi", "sol", "lua", "ar", "mar", "céu");

        Map<Integer, Long> resultado = palavras.stream()
                .collect(Collectors.groupingBy(n -> n.length(), Collectors.counting()));

        System.out.println(resultado);
    }
}
