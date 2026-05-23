package d_hashmap.extras.e24;

import java.util.HashMap;
import java.util.Map;

public class MesclarEstoquedeDuasFiliais {
    static void main() {

        Map<String, Integer> filial1 = new HashMap<>();
        filial1.put("Arroz", 30);
        filial1.put("Feijão", 20);
        filial1.put("Café", 15);

        Map<String, Integer> filial2 = new HashMap<>();
        filial2.put("Café", 10);
        filial2.put("Arroz", 25);
        filial2.put("Leite", 40);

        HashMap<String, Integer> estoqueTotal = new HashMap<>();

        for (Map.Entry<String, Integer> entry: filial1.entrySet()) {
            estoqueTotal.put(entry.getKey(),entry.getValue());
        }

        for (Map.Entry<String, Integer> entry: filial2.entrySet()) {
            if (estoqueTotal.containsKey(entry.getKey())) {
                estoqueTotal.put(entry.getKey(), estoqueTotal.get(entry.getKey()) + entry.getValue());
            } else estoqueTotal.put(entry.getKey(), entry.getValue());
        }

        System.out.println(estoqueTotal);
    }
}
