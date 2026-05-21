package hashmapExtras.h10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparProdutosPorCategoria {
    static void main() {
        Map<String, String> produtos = new HashMap<>();
        produtos.put("Arroz", "Grãos");
        produtos.put("Feijão", "Grãos");
        produtos.put("Café", "Bebidas");
        produtos.put("Leite", "Bebidas");
        produtos.put("Açúcar", "Doces");
        produtos.put("Paçoca", "Doces");
        produtos.put("Suco", "Bebidas");

        HashMap<String, List<String>> map = new HashMap<>();

        for (Map.Entry<String, String> entry : produtos.entrySet()) {
            if (map.containsKey(entry.getValue())){
                map.get(entry.getValue()).add(entry.getKey());
            } else { List<String> list = new ArrayList<>();
                list.add(entry.getKey());
                map.put(entry.getValue(), list);}
        }
        System.out.println(map);
    }
}
