package d_hashmap.revisao1.e52;

import java.util.HashMap;
import java.util.Map;

public class ContagemMaisMaior {
    // Conte a frequência de cada linguagem com getOrDefault, depois ache qual tem a maior frequência com entrySet.
    // Imprima nome e quantidade.

    static void main() {
        String[] linguagens = {"Java", "Python", "Java", "Go", "Python", "Java", "Go", "Rust"};

        Map<String, Integer> map = new HashMap<>();
        
        for (String l: linguagens) {
            if (map.containsKey(l)) {
                map.put(l,map.get(l)+1);
            }
            else {
                map.put(l,1);
            }
        }
        
        map.clear();

        for (String l: linguagens) {
            map.put(l,map.getOrDefault(l,0)+1);
        }

        int maiorFrequencia = 0;
        String maiorFrequenciaName = "";

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maiorFrequencia) {
                maiorFrequencia = entry.getValue();
                maiorFrequenciaName = entry.getKey();
            }
        }

        System.out.println(maiorFrequenciaName + ": " + maiorFrequencia);
    }
}
