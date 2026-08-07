package e_streams.e69;

import java.util.List;

public class FilterMaisSortedMaisReduce {
    // Um professor tem as notas dos alunos: {3.5, 8.0, 6.5, 9.2, 4.0, 7.5, 2.0, 8.8}. Filtre as notas abaixo de 5.0 (reprovados),
    // ordene do menor pro maior, imprima a lista, e use reduce com valor inicial pra somar o total das notas dos reprovados.

    public static void main(String[] args) {
        List<Double> notas = List.of(3.5, 8.0, 6.5, 9.2, 4.0, 7.5, 2.0, 8.8);

        List<Double> reprovados = notas.stream()
                .filter(n -> n < 5.0)
                .sorted()
                .toList();


        double somaReprovados = reprovados.stream()
                        .reduce(0.0,(a,b) -> a + b );

        System.out.println("Reprovados: " + reprovados);
        System.out.println("Soma: " + somaReprovados);
    }
}
