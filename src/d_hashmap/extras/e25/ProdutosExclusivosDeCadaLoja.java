package d_hashmap.extras.e25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutosExclusivosDeCadaLoja {
    static void main() {

        Map<String, Double> loja1 = new HashMap<>();
        loja1.put("Arroz", 22.90);
        loja1.put("Feijão", 8.50);
        loja1.put("Café", 15.00);

        Map<String, Double> loja2 = new HashMap<>();
        loja2.put("Café", 14.00);
        loja2.put("Açúcar", 4.75);
        loja2.put("Arroz", 21.50);

        List<String> soLoja1 = new ArrayList<>();
        List<String> soLoja2 = new ArrayList<>();

        for (Map.Entry<String, Double> entry: loja1.entrySet()) {
            if (!loja2.containsKey(entry.getKey())) {
                soLoja1.add(entry.getKey());
            }
        }

        for (Map.Entry<String, Double> entry: loja2.entrySet()) {
            if (!loja1.containsKey(entry.getKey())) {
                soLoja2.add(entry.getKey());
            }
        }

        System.out.println("Só na loja 1: " + soLoja1);
        System.out.println("Só na loja 2: " + soLoja2);
    }
}
