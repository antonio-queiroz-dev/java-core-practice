package d_hashmap.revisao1.e34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class computeIfAbsentLivre {
    //Agrupe os produtos pela categoria:
    static void main() {
        String[] produtos = {"Arroz", "Café", "Feijão", "Suco", "Sal", "Leite"};
        String[] categorias = {"Grãos", "Bebidas", "Grãos", "Bebidas", "Temperos", "Bebidas"};

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < produtos.length; i++) {
            map.computeIfAbsent(categorias[i], k -> new ArrayList<>()).add(produtos[i]);
        }

        System.out.println(map);
    }
}
