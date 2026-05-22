package d_hashmap.extras.e23;

import java.util.HashMap;
import java.util.Map;

public class CompararPrecosEntreLojas {
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

        HashMap<String, Double> bestPrice = new HashMap<>();

        for (Map.Entry<String, Double> entry: loja1.entrySet()) {
            if (loja2.containsKey(entry.getKey())) {
                if (loja2.get(entry.getKey()) < entry.getValue()){
                    bestPrice.put(entry.getKey(), loja2.get(entry.getKey()));
                } else bestPrice.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(bestPrice);
    }
}
