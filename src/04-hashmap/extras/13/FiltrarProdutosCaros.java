package hashmapExtras.h13;

import java.util.HashMap;
import java.util.Map;

public class FiltrarProdutosCaros {
    static void main() {
        Map<String, Double> precos = new HashMap<>();
        precos.put("Arroz", 22.90);
        precos.put("Feijão", 8.50);
        precos.put("Café", 15.00);
        precos.put("Açúcar", 4.75);
        precos.put("Leite", 6.30);

        Map<String, Double> map = new HashMap<>();

        for (Map.Entry<String, Double> entry: precos.entrySet()) {
            if (entry.getValue() > 10){
                map.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println(map);
    }
}
