package e_streams.e82;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByComTernarioMaisCounting {
    //Uma academia registrou os pesos (kg) dos alunos: {65.0, 92.0, 78.0, 55.0, 110.0, 83.0, 70.0, 95.0}.
    // Agrupe em "Acima de 80kg" (>= 80) e "Até 80kg" (< 80) usando groupingBy com ternário, e conte quantos em cada grupo. Sem consultar.

    static void main() {
        List<Double> pesos = List.of(65.0, 92.0, 78.0, 55.0, 110.0, 83.0, 70.0, 95.0);

        Map<String, Long> resultado = pesos.stream()
                .collect(Collectors.groupingBy(p-> p >= 80 ? "Acima de 80kg":"Até 80kg",Collectors.counting()));

        System.out.println(resultado);
    }
}
