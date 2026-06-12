package e_streams.e13;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingBy {
    // Dada uma lista de palavras, agrupe por tamanho:
    static void main() {
        List<String> palavras = List.of("sol", "lua", "casa", "mesa", "ar", "rio", "porta");

        Map<Integer, List<String>> resultado = palavras.stream()
                .collect(Collectors.groupingBy(p -> p.length()));

        System.out.println(resultado);
    }
}
