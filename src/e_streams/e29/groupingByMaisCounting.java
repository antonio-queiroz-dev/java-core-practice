package e_streams.e29;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByMaisCounting {
    // Conte quantas palavras tem de cada tamanho:

    static void main() {
        List<String> palavras = List.of("sol", "lua", "java", "mesa", "ar", "stream", "rio");

        Map<Integer, Long> resultado = palavras.stream()
                .collect(Collectors.groupingBy(n -> n.length(), Collectors.counting()));

        System.out.println(resultado);
    }
}
