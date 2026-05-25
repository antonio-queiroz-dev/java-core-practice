package d_hashmap.extras.e27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AgruparPalavrasPorLetraInicial {
    static void main() {
        String frase = "ana ama arroz bolo bala café carne";

        String[] palavras = frase.split(" ");

        HashMap<String, List<String>> map = new HashMap<>();

        for (String p: palavras) {
            String chave = String.valueOf(p.charAt(0));

            if (map.containsKey(chave)) {
                map.get(chave).add(p);
            } else {
                List<String> nomes = new ArrayList<>();
                nomes.add(p);
                map.put(chave,nomes);
            }
        }

        System.out.println(map);

    }
}
