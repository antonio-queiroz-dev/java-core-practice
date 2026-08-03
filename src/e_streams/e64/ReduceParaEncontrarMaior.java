package e_streams.e64;

import java.util.List;

public class ReduceParaEncontrarMaior {
    // Um grupo de amigos anotou quantos livros cada um leu no ano: {12, 5, 23, 8, 19, 3}. Use reduce pra encontrar o maior número de livros lidos.

    static void main() {
        List<Integer> lidos = List.of(12, 5, 23, 8, 19, 3);

        long resultado = lidos.stream()
                .reduce(0,(a,b) -> a > b ? a : b);

        System.out.println("Maior quantidade:" + resultado + " livros");

    }
}
