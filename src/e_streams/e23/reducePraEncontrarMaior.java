package e_streams.e23;

import java.util.List;

public class reducePraEncontrarMaior {
    // Dada uma lista de números, encontre o maior usando reduce:
    static void main() {
        List<Integer> numeros = List.of(14, 3, 27, 8, 45, 2, 19);

        int maior  = numeros.stream()
                .reduce(Integer::max)
                .orElse(0);

        System.out.println(maior);
    }
}
