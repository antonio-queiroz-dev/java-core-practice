package d_hashmap.revisao1.e19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoComComputeIfAbsent {
    // Agrupe as palavras pela última letra:

    static void main() {
        String frase = "java lua casa mesa sala";
        String[] palavra = frase.split(" ");
        Map<Character, List<String>> map = new HashMap<>();


        for (int i = 0; i < palavra.length; i++) {
            char ultima = palavra[i].charAt(palavra[i].length() - 1);
            map.computeIfAbsent(ultima, k -> new ArrayList<>()).add(palavra[i]);
        }


        System.out.println(map);
    }
}
