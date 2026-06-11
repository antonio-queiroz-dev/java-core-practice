package e_streams.e09;

import java.util.List;

public class forEach {
    // Dada uma lista de nomes, imprima só os que começam com a letra "M", um por linha.
    static void main() {
        List<String> nomes = List.of("Maria", "Carlos", "Marcos", "Ana", "Miguel", "Pedro");

        nomes.stream()
                .filter(n -> n.startsWith("M"))
                .forEach(n -> System.out.println(n));
    }
}
