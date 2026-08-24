package e_streams.e78;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByComTernarioMaisCounting {
    // Uma turma tirou as notas: {4.5, 7.0, 8.5, 3.0, 6.0, 9.5, 5.0, 2.5, 7.5, 6.5}. Agrupe as notas em "Aprovado" (>= 6.0) e
    // "Reprovado" (< 6.0) usando groupingBy com ternário, e conte quantos em cada grupo.

    static void main() {
        List<Double> notas = List.of(4.5, 7.0, 8.5, 3.0, 6.0, 9.5, 5.0, 2.5, 7.5, 6.5);

        Map<String, Long> resultado = notas.stream()
                .collect(Collectors.groupingBy(n -> n > 6.0 ? "Aprovado":"Reprovado",Collectors.counting()));

        System.out.println(resultado);

    }
}
