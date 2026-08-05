package e_streams.e68;

import java.util.List;

public class ReduceSemValorInicial {
    // Uma lista de produtos tem os pesos em kg: {0.5, 1.2, 0.3, 2.8, 0.7, 1.5}.
    // Use reduce sem valor inicial pra encontrar o menor peso.

    public static void main(String[] args) {
        List<Double> pesos = List.of(0.5, 1.2, 0.3, 2.8, 0.7, 1.5);

        double menor = pesos.stream()
                .reduce((a,b) -> a < b ? a : b)
                .orElse(0.0);

        System.out.println("Menor peso: " + menor + "kg");
    }
}
