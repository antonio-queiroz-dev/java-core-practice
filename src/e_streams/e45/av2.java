package e_streams.e45;

import java.util.List;

public class av2 {
    //Dada uma lista de salários, calcule a média apenas dos salários acima de 2000.

    static void main() {
        List<Double> salarios = List.of(1500.0, 3200.0, 980.0, 4500.0, 2100.0, 1800.0);

        double resultado = salarios.stream()
                .filter(n -> n > 2000)
                .mapToDouble(n -> n)
                .average()
                .orElse(0);

        System.out.println(resultado);
    }
}
