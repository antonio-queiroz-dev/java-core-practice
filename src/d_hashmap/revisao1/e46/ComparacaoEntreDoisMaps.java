package d_hashmap.revisao1.e46;

import java.util.HashMap;
import java.util.Map;

public class ComparacaoEntreDoisMaps {
    //Para cada produto, descubra qual loja é mais barata. Imprima no formato produto → lojaN.

    static void main() {
        Map<String, Integer> loja1 = Map.of("arroz", 25, "feijão", 18, "leite", 30);
        Map<String, Integer> loja2 = Map.of("arroz", 22, "feijão", 20, "leite", 28);

        Map<String, String> maisBarato = new HashMap<>();

        for (Map.Entry<String, Integer> entry: loja1.entrySet()) {
            if (entry.getValue() < loja2.get(entry.getKey())) {
                maisBarato.put(entry.getKey(), "Loja1");
            } else {
                maisBarato.put(entry.getKey(), "Loja2");
            }
        }

        System.out.println(maisBarato);
    }
}
