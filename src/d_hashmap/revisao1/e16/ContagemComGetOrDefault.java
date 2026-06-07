package d_hashmap.revisao1.e16;

import java.util.HashMap;
import java.util.Map;

public class ContagemComGetOrDefault {
    // Conte quantas vezes cada número aparece, usando getOrDefault:
    static void main() {
        int[] numeros = {1, 3, 2, 1, 3, 1, 4, 2, 5, 3, 1};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {
            map.put(numeros[i],map.getOrDefault(numeros[i],0)+1);
        }

        System.out.println(map);
    }
}
