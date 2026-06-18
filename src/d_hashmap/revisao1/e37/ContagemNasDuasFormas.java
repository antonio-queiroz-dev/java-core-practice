package d_hashmap.revisao1.e37;

import java.util.HashMap;
import java.util.Map;

public class ContagemNasDuasFormas {
    // Conte quantas vezes cada fruta aparece:

    static void main() {
        String[] frutas = {"maçã", "banana", "maçã", "uva", "banana", "maçã"};

        Map<String, Integer> contagem = new HashMap<>();

        for (String f: frutas) {
            if (contagem.containsKey(f)) {
                contagem.put(f,contagem.get(f)+1);
            } else {
                contagem.put(f,1);
            }
        }

        System.out.println(contagem);

        contagem.clear();

        for (String f: frutas) {
            contagem.merge(f,1,(antigo, novo) -> antigo + novo);
        }

        System.out.println(contagem);
    }
}
