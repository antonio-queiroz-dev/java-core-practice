package hashmapExtras.h19;

import java.util.HashMap;

public class VerificarSeDuasStringsSãoAnagramas {
    static void main() {
        String palavra1 = "roma";
        String palavra2 = "amor";

        HashMap<Character, Integer> letras1 = new HashMap<>();
        HashMap<Character, Integer> letras2 = new HashMap<>();

        for (char p: palavra1.toCharArray()){
            if (letras1.containsKey(p)){
                letras1.put(p,letras1.get(p)+1);
            } else letras1.put(p,1);
        }

        for (char p: palavra2.toCharArray()){
            if (letras2.containsKey(p)){
                letras2.put(p,letras2.get(p)+1);
            } else letras2.put(p,1);
        }

        if (letras1.equals(letras2)) {
            System.out.println("São anagramas");
        } else {
            System.out.println("Não sâo anagramas");
        }

    }
}
