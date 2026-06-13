package e_streams.e15;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByMaisCounting {
    //Conte quantas palavras tem de cada tamanho:

    static void main() {
        List<String> palavras = List.of("sol", "lua", "casa", "mesa", "ar", "rio", "porta");

        Map<Integer, Long> resultado = palavras.stream()
                .collect(Collectors.groupingBy(p -> p.length(), Collectors.counting()));

        System.out.println(resultado);
    }
}
