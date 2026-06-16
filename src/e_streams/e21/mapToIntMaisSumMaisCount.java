package e_streams.e21;

import java.util.List;

public class mapToIntMaisSumMaisCount {
    // Dada uma lista de palavras, calcule o tamanho total de todas as letras e a quantidade de palavras com mais de 4 letras:
    static void main() {
        List<String> palavras = List.of("java", "stream", "código", "api", "teste", "bug");

        int quantidadeLetras = palavras.stream()
                .mapToInt(n -> n.length()).sum();

        long mais4Letras = palavras.stream()
                .filter(n -> n.length() > 4)
                .count();

        System.out.println("Total de letras: " + quantidadeLetras);
        System.out.println("Palavras com mais de 4 letras: " +mais4Letras);
    }
}
