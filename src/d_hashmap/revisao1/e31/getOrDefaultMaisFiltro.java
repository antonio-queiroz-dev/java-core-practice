package d_hashmap.revisao1.e31;

import java.util.HashMap;
import java.util.Map;

public class getOrDefaultMaisFiltro {
    // Conte a frequência de cada palavra e imprima só as que aparecem exatamente 2 vezes:

    static void main() {
        String frase = "o sol e a lua o sol e o mar";
        String[] palavras = frase.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s: palavras) {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
}
