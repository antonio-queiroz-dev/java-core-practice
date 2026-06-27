package e_streams.e30;

import java.util.List;

public class filterMaisReduce {
    // Dada uma lista de números, filtre os ímpares e multiplique todos entre si:

    static void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7);

        int resultado = numeros.stream()
                .filter(n -> n % 2 !=0)
                .reduce(1,(acumulador ,elemento) -> acumulador * elemento);

        System.out.println("Produto dos ímpares: " + resultado);
    }
}
