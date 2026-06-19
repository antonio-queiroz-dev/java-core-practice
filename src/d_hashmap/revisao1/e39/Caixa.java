package d_hashmap.revisao1.e39;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
    // Conte quantas vezes cada produto aparece.
    static void main() {
        String[] produtos = {"arroz", "feijão", "arroz", "leite", "arroz", "feijão"};
        Map<String, Integer> map = new HashMap<>();

        for (String p: produtos) {
            if (map.containsKey(p)) {
                map.put(p,map.get(p)+1);
            } else map.put(p,1);
        }

        System.out.println(map);
        map.clear();

        for (String p: produtos) {
            map.put(p,map.getOrDefault(p,0) +1);
        }
        System.out.println(map);
    }
}
