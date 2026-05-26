package d_hashmap.extras.e34;

import java.util.HashMap;
import java.util.Map;

public class PalavrasQueAparecemMaisDeUmaVez {
    static void main() {
        String frase = "o gato viu o rato e o gato correu e o rato fugiu";
        String[] palavras = frase.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s: palavras) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else map.put(s,1);
        }

        Map<String, Integer> mapFinal = new HashMap<>();

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                mapFinal.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Palavras repetidas: " + mapFinal);

    }
}
