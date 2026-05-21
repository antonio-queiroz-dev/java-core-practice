package hashmapExtras.h9;

import java.util.HashMap;
import java.util.Map;

public class FrequênciaCategorias {
    static void main() {

        Map<String, String> produtos = new HashMap<>();
        produtos.put("Arroz", "Grãos");
        produtos.put("Feijão", "Grãos");
        produtos.put("Café", "Bebidas");
        produtos.put("Leite", "Bebidas");
        produtos.put("Açúcar", "Doces");
        produtos.put("Paçoca", "Doces");
        produtos.put("Suco", "Bebidas");

        HashMap<String, Integer> map = new HashMap<>();

        for (Map.Entry<String, String> entry: produtos.entrySet()) {
            if (map.containsKey(entry.getValue())){
                map.put(entry.getValue(),map.get(entry.getValue())+1);
            } else map.put(entry.getValue(),1);
        }
        System.out.println(map);
    }
}
