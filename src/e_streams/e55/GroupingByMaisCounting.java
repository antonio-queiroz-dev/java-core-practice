package e_streams.e55;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMaisCounting {

    // Conte quantas vezes cada fruta aparece, depois descubra qual fruta apareceu mais e imprima só o nome.

    static void main() {
        List<String> frutas = List.of("banana", "maçã", "banana", "uva", "maçã", "banana", "uva", "maçã");

        Map<String, Long> map = frutas.stream()
                .collect(Collectors.groupingBy(fruta -> fruta, Collectors.counting()));

        String maisFrequente = "";
        long maior = 0;

        for (Map.Entry<String, Long> entry: map.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
                maisFrequente = entry.getKey();
            }
        }

        System.out.println(maisFrequente);
    }
}
