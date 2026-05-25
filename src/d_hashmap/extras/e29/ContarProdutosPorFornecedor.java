package d_hashmap.extras.e29;

import java.util.HashMap;
import java.util.Map;

public class ContarProdutosPorFornecedor {
    static void main() {
        Map<String, String> produtos = new HashMap<>();
        produtos.put("Arroz", "Fornecedor A");
        produtos.put("Feijão", "Fornecedor A");
        produtos.put("Café", "Fornecedor B");
        produtos.put("Leite", "Fornecedor B");
        produtos.put("Açúcar", "Fornecedor C");
        produtos.put("Sal", "Fornecedor A");
        produtos.put("Suco", "Fornecedor B");

        HashMap<String,Integer> map = new HashMap<>();

        for (Map.Entry<String, String> entry: produtos.entrySet()) {
            if (map.containsKey(entry.getValue())) {
                map.put(entry.getValue(),map.get(entry.getValue())+1);
            } else map.put(entry.getValue(), 1);
        }

        System.out.println(map);
    }
}
