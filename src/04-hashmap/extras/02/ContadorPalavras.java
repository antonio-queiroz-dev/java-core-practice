package hashmapExtras.h2;

import java.util.HashMap;

public class ContadorPalavras {
    static void main() {
        String frase = "o rato roeu a roupa do rei de roma e o rei ficou sem roupa";

        String[] palavra = frase.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String p: palavra) {
            if (map.containsKey(p)){
                map.put(p,map.get(p)+1);
            } else map.put(p,1);
        }
        System.out.printf(map.toString());
    }
}
