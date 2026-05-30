package d_hashmap.revisao1.e06;

import java.util.HashMap;
import java.util.Map;

public class MergeParaSomarEstoque {
    public static void main(String[] args) {
        String[] entrega1 = {"Arroz", "Feijão", "Café", "Arroz", "Café"};
        int[] qtd1 = {10, 5, 8, 15, 12};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < entrega1.length; i++) {
            map.merge(entrega1[i],qtd1[i],(antigo, novo) -> antigo + novo );
        }

        System.out.println(map);
    }
}
