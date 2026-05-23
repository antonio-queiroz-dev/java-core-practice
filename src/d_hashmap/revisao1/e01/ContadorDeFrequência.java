package d_hashmap.revisao1.e01;

import java.util.HashMap;

public class ContadorDeFrequência {
    static void main() {

        String frase = "java é bom java é fácil java é vida";

        String[] palavras = frase.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String s: palavras) {
            if (map.containsKey(s)) {
                map.put(s,map.get(s)+1);
            } else map.put(s,1);
        }

        System.out.println(map);
    }
}
