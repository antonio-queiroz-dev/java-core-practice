package d_hashmap.revisao1.e24;

import java.util.HashMap;
import java.util.Map;

public class getOrDefaultLivre {
    //Dado um texto, conte a frequência de cada caractere (incluindo espaços) usando getOrDefault:
    static void main() {
        String texto = "java streams";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < texto.length(); i++) {
            map.put(texto.toCharArray()[i],map.getOrDefault(texto.toCharArray()[i],0)+1);
        }
        System.out.println(map);
    }
}
