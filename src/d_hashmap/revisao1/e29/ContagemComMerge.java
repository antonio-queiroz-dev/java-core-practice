package d_hashmap.revisao1.e29;

import java.util.HashMap;
import java.util.Map;

public class ContagemComMerge {
    // Conte quantas vezes cada cor aparece:
    static void main() {
        String[] cores = {"azul", "vermelho", "azul", "verde", "vermelho", "azul", "verde", "azul"};
        Map<String, Integer> map = new HashMap<>();

        for (String c: cores) {
            map.merge(c,1,(antigo, novo) -> antigo +novo);
        }
        System.out.println(map);
    }
}
