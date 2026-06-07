package d_hashmap.revisao1.e18;

import java.util.HashMap;
import java.util.Map;

public class CruzarMaps {
    // Dado um Map de produtos e preços, e outro de produtos e categorias,
    // encontre o produto mais caro de cada categoria.

    static void main() {
        Map<String, Double> precos = new HashMap<>();
        precos.put("Arroz", 22.90);
        precos.put("Feijão", 8.50);
        precos.put("Café", 15.00);
        precos.put("Leite", 6.30);
        precos.put("Suco", 12.00);
        precos.put("Sal", 3.50);

        Map<String, String> categorias = new HashMap<>();
        categorias.put("Arroz", "Grãos");
        categorias.put("Feijão", "Grãos");
        categorias.put("Café", "Bebidas");
        categorias.put("Leite", "Bebidas");
        categorias.put("Suco", "Bebidas");
        categorias.put("Sal", "Temperos");

        Map<String, Double> maisCaroProduto = new HashMap<>();
        Map<String, String> maisCaroCategoria = new HashMap<>();

        for (Map.Entry<String, Double> entry: precos.entrySet()) {
            String produto = entry.getKey();
            double preco = entry.getValue();
            String categoria = categorias.get(produto);

            if (!maisCaroProduto.containsKey(categoria)) {
                maisCaroProduto.put(categoria, preco);
                maisCaroCategoria.put(categoria, produto);
            } else if (preco > maisCaroProduto.get(categoria)) {
                maisCaroProduto.put(categoria, preco);
                maisCaroCategoria.put(categoria, produto);
            }
        }

        for (Map.Entry<String, Double> entry: maisCaroProduto.entrySet()) {
            System.out.println(maisCaroCategoria.get(entry.getKey()) + " → " + entry.getKey() + " (R$" + entry.getValue() + ")");
        }
    }
}
