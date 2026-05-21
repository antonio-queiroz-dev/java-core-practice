package hashmapExtras.h18;

import java.util.HashMap;
import java.util.Map;

public class LetraMaisFrequenteDeUmaPalavra {
    static void main() {
        String palavra = "abacaxi";

        HashMap<Character, Integer> letras = new HashMap<>();


        for (char c: palavra.toCharArray()) {
            if (letras.containsKey(c)) {
                letras.put(c,letras.get(c)+1);
            } else letras.put(c,1);
        }

        int maior = Integer.MIN_VALUE;
        Character mais = ' ';

        for (Map.Entry<Character, Integer> entry: letras.entrySet()) {
            if (entry.getValue() > maior){
                mais = entry.getKey();
                maior = entry.getValue();
            }
        }

        System.out.println("Letra mais frequente:" + mais + " — " + maior + "vezes");
    }
}
