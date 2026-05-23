package d_hashmap.revisao1.e02;

import java.util.HashMap;

public class VerificarAnagramas {
    static void main() {

        String palavra1 = "listen";
        String palavra2 = "silent";

        char letras1 = palavra1.charAt(0);

        HashMap<Character, Integer> pala1 = new HashMap<>();
        HashMap<Character, Integer> pala2 = new HashMap<>();

        for (char c: palavra1.toCharArray()) {
            if (pala1.containsKey(c)) {
                pala1.put(c,pala1.get(c)+1);
            } else pala1.put(c, 1);
        }
        for (char c: palavra2.toCharArray()) {
            if (pala2.containsKey(c)) {
                pala2.put(c,pala2.get(c)+1);
            } else pala2.put(c, 1);
        }

        if (pala1.equals(pala2)) {
            System.out.println("São anagramas!");
        } else System.out.println("Não são anagramas!");


    }
}
