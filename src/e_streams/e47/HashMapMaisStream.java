package e_streams.e47;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapMaisStream {
    // Dado um Map de alunos e notas, use stream no entrySet pra filtrar os alunos aprovados (nota >= 7) e colete os nomes em uma lista.

    static void main() {
        Map<String, Integer> notas = Map.of("Ana", 8, "Bruno", 5, "Carla", 9, "Daniel", 6, "Eva", 7);

        List<String> resultado = notas.entrySet()
                .stream()
                .filter(n -> n.getValue() >= 7)
                .map(n -> n.getKey())
                .collect(Collectors.toList());

        System.out.println(resultado);
    }
}
