package d_hashmap.revisao1.e49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsent {
    // O produto produtos[i] foi vendido ao preço precos[i]. Agrupe os preços por produto numa List<Integer>. Use computeIfAbsent.

    static void main() {
        String[] produtos = {"arroz", "feijão", "macarrão", "arroz", "leite", "feijão", "arroz"};
        int[] precos = {25, 18, 12, 27, 30, 20, 23};

        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < produtos.length; i++) {
            map.computeIfAbsent(produtos[i], k -> new ArrayList<>()).add(precos[i]);
        }

        System.out.println(map);
    }
}
