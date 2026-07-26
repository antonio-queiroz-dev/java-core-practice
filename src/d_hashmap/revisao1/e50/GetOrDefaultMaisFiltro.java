package d_hashmap.revisao1.e50;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultMaisFiltro {
    //Conte a frequência de cada palavra, depois imprima apenas as que aparecem 2 vezes ou mais.

    static void main() {
        String[] palavras = {"java", "spring", "java", "docker", "spring", "java", "redis", "docker"};

        Map<String,Integer> map = new HashMap<>();

        for (String p: palavras) {
            map.put(p, map.getOrDefault(p,0)+1);
        }

        Map<String, Integer> acimaDeDois = new HashMap<>();

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue()>=2) acimaDeDois.put(entry.getKey(), entry.getValue());
        }

        System.out.println(acimaDeDois);
    }

}
