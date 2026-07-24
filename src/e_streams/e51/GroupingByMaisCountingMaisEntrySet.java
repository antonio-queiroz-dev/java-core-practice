package e_streams.e51;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMaisCountingMaisEntrySet {
    // Conte os votos por candidato e depois descubra quem ganhou (mais votos). Imprima só o nome do vencedor.

    public static void main(String[] args) {
        List<String> votos = List.of("Ana", "Bruno", "Ana", "Ana", "Bruno", "Carla", "Bruno", "Ana");

        Map<String, Long> contagem = votos.stream()
                        .collect(Collectors.groupingBy(v -> v, Collectors.counting()));

        String vencedor = "";
        long maior = 0;

        for (Map.Entry<String, Long> entry: contagem.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
                vencedor = entry.getKey();
            }
        }

        System.out.println(vencedor);
    }
}
