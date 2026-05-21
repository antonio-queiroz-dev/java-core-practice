package hashmapExtras.h14;

import java.util.HashMap;

public class ContarPalavrasPorTamanho {
    static void main() {
        String frase = "o rato roeu a roupa do rei de roma";
        String[] palavras = frase.split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < palavras.length ; i++) {
            if (map.containsKey(palavras[i].length())){
                map.put(palavras[i].length(), map.get(palavras[i].length())+1);
            }else map.put(palavras[i].length(), 1);
        }

        System.out.println(map);
    }
}
