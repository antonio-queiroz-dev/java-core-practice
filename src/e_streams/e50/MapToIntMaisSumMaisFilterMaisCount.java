package e_streams.e50;

import java.util.List;

public class MapToIntMaisSumMaisFilterMaisCount {
    // Calcule duas coisas:
    //
    //O total vendido (soma de tudo)
    //Quantas vendas foram acima de 100

    static void main() {
        List<Integer> vendas = List.of(120, 80, 250, 60, 300, 45, 190);

        int total = vendas.stream()
                .mapToInt(n -> n)
                .sum();


        long acimaDeCem = vendas.stream()
                .filter(n -> n > 100)
                .count();

        System.out.println("Total: " + total);
        System.out.println("Acima de 100: " + acimaDeCem);


    }
}
