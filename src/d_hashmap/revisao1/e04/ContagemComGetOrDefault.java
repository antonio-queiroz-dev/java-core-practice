package d_hashmap.revisao1.e04;

import java.util.HashMap;
import java.util.Map;

public class ContagemComGetOrDefault {
    static void main() {

        int[] numeros = {5, 3, 7, 3, 5, 5, 8, 7, 3};
        Map<Integer, Integer> map = new HashMap<>();

        for (int n: numeros) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        System.out.println(map);
    }
}
