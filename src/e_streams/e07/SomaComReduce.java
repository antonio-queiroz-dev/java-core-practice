package e_streams.e07;

import java.util.List;

public class SomaComReduce {
    // Dada uma lista de números, filtre os pares e some todos.
    static void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (acumulador, elemento) -> acumulador + elemento);

//        int soma = numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .reduce(0, Integer::sum);

        System.out.println(soma);
    }
}
