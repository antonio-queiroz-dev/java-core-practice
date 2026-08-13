package e_streams.e73;

import java.util.List;

public class FilterMaisReduce {
    // Um sensor mediu temperaturas ao longo do dia: {28.5, 31.0, 35.2, 29.8, 33.1, 27.0, 30.5}.
    // Filtre as temperaturas acima de 30 graus e use reduce sem valor inicial pra encontrar a menor entre elas.

    static void main() {
        List<Double> temperaturas = List.of(28.5, 31.0, 35.2, 29.8, 33.1, 27.0, 30.5);

        Double menor = temperaturas.stream()
                .filter(n -> n > 30)
                .reduce((a,b) -> a < b ? a : b)
                .orElse(0.0);

        System.out.println("Menor temperatura acima de 30: " + menor);
    }
}
