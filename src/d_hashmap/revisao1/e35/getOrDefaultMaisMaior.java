package d_hashmap.revisao1.e35;

import java.util.HashMap;
import java.util.Map;

public class getOrDefaultMaisMaior {
    // Conte a frequência de cada letra numa palavra e encontre a mais frequente:

    static void main() {

        String palavra = "mississippi";
        Map<Character, Integer> map = new HashMap<>();

        for (Character c: palavra.toCharArray()) {
            map.merge(c,1,(antigo, novo) -> antigo + novo);
        }

        char mais = ' ';
        int maior = 0;

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
                mais = entry.getKey();
            }
        }
        System.out.println("Letra mais frequente: " + mais + " (" + maior + " vezes)");
    }
}
