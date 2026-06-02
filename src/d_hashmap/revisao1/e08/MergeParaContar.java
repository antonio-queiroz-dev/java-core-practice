package d_hashmap.revisao1.e08;

import java.util.HashMap;
import java.util.Map;

public class MergeParaContar {
    //Conte a frequência de cada palavra usando merge:
    static void main() {
        String frase = "o sol o mar o sol brilha no mar";
        String[] palavra = frase.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < palavra.length; i++) {
            map.merge(palavra[i],1,(antigo, novo) -> antigo + 1);
        }

        System.out.println(map);
    }
}
