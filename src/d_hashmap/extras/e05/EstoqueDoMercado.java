package hashmapExtras.h5;

import java.util.HashMap;

public class EstoqueDoMercado {
    static void main() {
        String[] caminhao = {"Arroz", "Feijão", "Arroz", "Café", "Feijão", "Arroz", "Leite", "Café"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String p: caminhao) {
            if (map.containsKey(p)){
                map.put(p,map.get(p)+1);
            } else map.put(p,1);
        }

        System.out.println(map);
    }
}
