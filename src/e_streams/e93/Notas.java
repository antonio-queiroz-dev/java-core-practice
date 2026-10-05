package e_streams.e93;

import java.util.List;
import java.util.stream.Collectors;

public class Notas {
    //Notas de avaliação de animes: {9.5, 7.0, 8.5, 6.0, 9.0, 4.5, 8.0, 7.5}.
    // Filtre notas acima de 6.5, aplique um peso de 0.8 (multiplique por 0.8),
    // ordene do menor pro maior, converta cada valor pra String, e junte separado por " | ".


    public static void main(String[] args) {
        List<Double> notas = List.of(9.5, 7.0, 8.5, 6.0, 9.0, 4.5, 8.0, 7.5);

        String resultado = notas.stream()
                .filter(n -> n > 6.5)
                .map(n -> n * 0.8)
                .map(n-> n.toString())
                .sorted()
                .collect(Collectors.joining(" | "));

        System.out.println(resultado);
    }
}
