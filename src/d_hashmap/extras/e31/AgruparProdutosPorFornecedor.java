package d_hashmap.extras.e31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparProdutosPorFornecedor {
    static void main() {
        Map<String, String> produtos = new HashMap<>();
        produtos.put("Arroz", "Fornecedor A");
        produtos.put("Feijão", "Fornecedor A");
        produtos.put("Café", "Fornecedor B");
        produtos.put("Leite", "Fornecedor B");
        produtos.put("Açúcar", "Fornecedor C");
        produtos.put("Sal", "Fornecedor A");
        produtos.put("Suco", "Fornecedor B");

        Map<String, List<String>> map = new HashMap<>();

        for (Map.Entry<String, String> entry: produtos.entrySet()) {
            if (map.containsKey(entry.getValue())) {
                map.get(entry.getValue()).add(entry.getKey());
            } else {
                List<String> produtosList = new ArrayList<>();
                produtosList.add(entry.getKey());
                map.put(entry.getValue(), produtosList);
            }
        }

        System.out.println(map);
    }
}
