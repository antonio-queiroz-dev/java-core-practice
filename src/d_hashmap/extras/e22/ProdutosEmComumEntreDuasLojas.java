package d_hashmap.extras.e22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutosEmComumEntreDuasLojas {
    static void main() {
        Map<String, Double> loja1 = new HashMap<>();
        loja1.put("Arroz", 22.90);
        loja1.put("Feijão", 8.50);
        loja1.put("Café", 15.00);
        loja1.put("Leite", 6.30);

        Map<String, Double> loja2 = new HashMap<>();
        loja2.put("Café", 14.00);
        loja2.put("Açúcar", 4.75);
        loja2.put("Arroz", 21.50);
        loja2.put("Sal", 3.50);


        List<String> comum = new ArrayList<>();

        for (Map.Entry<String, Double> entry: loja1.entrySet()) {
            if (loja2.containsKey(entry.getKey())) {
                comum.add(entry.getKey());
            }
        }
        System.out.println(comum);
    }
}
