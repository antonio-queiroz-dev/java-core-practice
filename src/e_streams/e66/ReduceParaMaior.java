package e_streams.e66;

import java.util.List;

public class ReduceParaMaior {
    // Um restaurante anotou os tempos de espera (em minutos) dos clientes: {15, 8, 22, 5, 30, 12}.
    // Use reduce sem valor inicial pra encontrar o maior tempo de espera.

    static void main() {
        List<Integer> tempos = List.of(15, 8, 22, 5, 30, 12);

        long resultado = tempos.stream()
                .reduce((a, b) -> a > b ? a : b)
                .orElse(0);

        System.out.println("Maior espera: " + resultado + " minutos");
    }
}
