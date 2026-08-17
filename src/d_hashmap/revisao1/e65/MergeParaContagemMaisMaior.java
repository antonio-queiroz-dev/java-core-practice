package d_hashmap.revisao1.e65;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeParaContagemMaisMaior {
    //Uma enquete perguntou o sistema operacional favorito:
    // {"Windows", "Linux", "Mac", "Linux", "Windows", "Linux", "Mac", "Windows", "Windows", "Linux"}.
    // Conte os votos usando merge com Integer::sum. Depois, encontre o mais votado.

    static void main() {
        List<String> list = List.of("Windows", "Linux", "Mac", "Linux", "Windows", "Linux", "Mac", "Windows", "Windows", "Linux");
        Map<String, Integer> votos = new HashMap<>();

        for (String l: list) {
            votos.merge(l,1, Integer::sum);
        }

        int maisVoto = 0;
        String maisVotado = "";

        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maisVoto) {
                maisVoto = entry.getValue();
                maisVotado = entry.getKey();
            }
        }

        System.out.println("Votos: " + votos);
        System.out.println("Mais votado: " + maisVotado + " (" + maisVoto + " votos )");
    }
}
