package e_streams.e57;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMaisCounting {
    // Conte os votos por linguagem e descubra qual linguagem empatou com outra (mesma quantidade). Imprima as duas linguagens empatadas e a quantidade.

    static void main() {
        List<String> linguagens = List.of("Java", "Python", "Java", "Go", "Python", "Java", "Go", "Python", "Rust");

        Map<String, Long> map = linguagens.stream()
                .collect(Collectors.groupingBy(v -> v,Collectors.counting()));

        String maisVotos = "";
        long maior = 0;

        for (Map.Entry<String, Long> entry: map.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
                maisVotos = entry.getKey();
            }
        }

        System.out.println(maisVotos + ": " + maior);
    }
}
