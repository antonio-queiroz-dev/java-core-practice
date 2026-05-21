package hashmapExtras.h4;

import java.util.HashMap;

public class ContadorDLetras {
    static void main() {

        String palavra = "abacaxi";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : palavra.toCharArray()){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else map.put(c,1);
        }

        System.out.println(map.toString());

    }
}
