package e_streams.e12;

import java.util.List;

public class mapToIntMaisSum {
    // Dada uma lista de palavras, calcule o total de letras de todas as palavras juntas.

    static void main() {
        List<String> palavras = List.of("java", "streams", "são", "legais");
        int resultado = palavras.stream()
                .mapToInt(n -> n.length())
                .sum();

        System.out.println("Total de letras: " + resultado);
    }
}
