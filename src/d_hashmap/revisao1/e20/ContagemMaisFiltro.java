package d_hashmap.revisao1.e20;

import java.util.HashMap;
import java.util.Map;

public class ContagemMaisFiltro {
    // Dado um array de palavras, conte a frequência de cada uma e depois imprima só as que aparecem mais de uma vez.

    static void main() {
        String[] palavras = {"java", "python", "java", "rust", "python", "java", "go", "rust"};
        Map<String, Integer> map = new HashMap<>();

//        for (int i = 0; i < palavras.length; i++) {
//            if (map.containsKey(palavras[i])) {
//                map.put(palavras[i], map.get(palavras[i])+1);
//            } else map.put(palavras[i],1);
//        }

        for (int i = 0; i < palavras.length; i++) {
            map.merge(palavras[i], 1,(antigo, novo) -> antigo + novo);
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }
}
