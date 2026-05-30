package d_hashmap.extras.e40;

import java.util.HashMap;
import java.util.Map;

public class ContarFrequencia {
    static void main() {

        String palavra = "paralelepipedo";
        Map<Character, Integer> map = new HashMap<>();

        for (char c: palavra.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);
    }
}
