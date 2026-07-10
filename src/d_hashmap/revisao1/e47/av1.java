package d_hashmap.revisao1.e47;

import java.util.HashMap;
import java.util.Map;

public class av1 {
    // Dado um array de palavras, encontre a palavra que mais aparece e imprima ela junto com a quantidade.

    static void main() {
        String[] palavras = {"sol", "lua", "sol", "mar", "lua", "sol", "céu", "mar"};

        Map<String, Integer> map = new HashMap<>();

        for (String p: palavras) {
            map.put(p,map.getOrDefault(p,0)+1);
        }

        int mais = 0;
        String maisRep = "";

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > mais) {
                mais = entry.getValue();
                maisRep = entry.getKey();
            }
        }

        System.out.println(maisRep + ": " + mais);
    }
}
