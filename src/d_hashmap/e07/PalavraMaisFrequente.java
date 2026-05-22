package fase04.exe07;

import java.util.HashMap;
import java.util.Map;

public class PalavraMaisFrequente {
    static void main() {

        PalavraMaisFrequente palavraMaisFrequente = new PalavraMaisFrequente();

        String a = "o gato viu o gato e o cachorro";
        System.out.printf("Esperado: o\nSaida:    " + palavraMaisFrequente.palavraMaisFrequente(a) + "\n");

        String b = "java java python";
        System.out.printf("Esperado: java\nSaida:    " + palavraMaisFrequente.palavraMaisFrequente(b) + "\n");

        String c = "hello";
        System.out.printf("Esperado: hello\nSaida:    " + palavraMaisFrequente.palavraMaisFrequente(c) + "\n");

    }

    public String palavraMaisFrequente(String frase) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] palavra = frase.split(" ");

        for (String p: palavra) {
            if (map.containsKey(p)) {
                map.put(p,map.get(p)+1);
            } else map.put(p,1);
        }

        String maisFrequente = "";
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                maisFrequente = entry.getKey();
            }
        }

        return maisFrequente;

    }
}
