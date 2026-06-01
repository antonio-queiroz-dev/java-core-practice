package d_hashmap.revisao1.e07;

import java.util.HashMap;
import java.util.Map;

public class getOrDefaultParaContarCategorias {
    //Dado um Map de produtos e categorias, conte quantos produtos tem em cada categoria usando getOrDefault:
    static void main() {
        Map<String, String> produtos = new HashMap<>();
        produtos.put("Arroz", "Grãos");
        produtos.put("Feijão", "Grãos");
        produtos.put("Café", "Bebidas");
        produtos.put("Suco", "Bebidas");
        produtos.put("Leite", "Bebidas");
        produtos.put("Açúcar", "Doces");

        Map<String, Integer> categorias = new HashMap<>();

        for (Map.Entry<String, String> entry: produtos.entrySet()) {
            categorias.put(entry.getValue(),categorias.getOrDefault(entry.getValue(),0)+1);
        }

        System.out.println(categorias);

    }
}
