package e_streams.e24;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByMaisContagemMaisFilter {
    // Dada uma lista de palavras, agrupe por tamanho, mas mostre só os grupos com mais de 1 palavra:

    static void main() {
        List<String> palavras = List.of("sol", "lua", "casa", "mesa", "ar", "rio", "porta", "mar");

        Map<Integer, List<String>> agrupado = palavras.stream()
                .collect(Collectors.groupingBy(p -> p.length()));

        for (Map.Entry<Integer, List<String>> entry : agrupado.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
}
