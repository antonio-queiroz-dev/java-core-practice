package e_streams.e04;

import java.util.List;

public class ContarElementosFiltrados {
    // Dada uma lista de palavras, conte quantas têm mais de 4 letras.
    static void main() {
        List<String> palavras = List.of("java", "sol", "programacao", "lua", "stream", "api", "codigo");

        long palavrasMaisQuatroLetras = palavras.stream()
                .filter(n -> n.length() > 4)
                .count();

        System.out.println("Palavras com mais de 4 letras: " + palavrasMaisQuatroLetras );

    }
}
