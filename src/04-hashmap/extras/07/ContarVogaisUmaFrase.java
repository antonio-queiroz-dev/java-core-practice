package hashmapExtras.h7;

import java.util.HashMap;

public class ContarVogaisUmaFrase {
    static void main() {
        String frase = "o rato roeu a roupa do rei de roma";
        HashMap<Character, Integer> map = new HashMap<>();
        String vogais = "aeiou";

        for (char c: frase.toCharArray()){
            if (vogais.contains(String.valueOf(c))){
                if (map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                } else map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
