package e_streams.e90;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByComTernarioMaisCounting {
    // Episódios por anime: {500, 37, 1100, 24, 25, 87, 37, 47, 12, 200}. Agrupe em "Longo" (>= 100) e "Curto" (< 100)
    // com groupingBy + ternário + counting. Depois, percorra o resultado com for + entrySet pra encontrar qual grupo tem mais animes.


    static void main() {
        List<Integer> episodios = List.of(500, 37, 1100, 24, 25, 87, 37, 47, 12, 200);

        Map<String, Long> agrupamento = episodios.stream()
                .collect(Collectors.groupingBy((n) -> n>=100 ? "Longo":"Curto",Collectors.counting()));

        System.out.println(agrupamento);

        Long maisAnime = 0L;
        String mais = "";
        for (Map.Entry<String, Long> entry: agrupamento.entrySet()) {
            if (entry.getValue() > maisAnime) {
                maisAnime = entry.getValue();
                mais = entry.getKey();
            }
        }

        System.out.println("Grupo com mais animes: " + mais +" (" + maisAnime + ")");
    }
}
