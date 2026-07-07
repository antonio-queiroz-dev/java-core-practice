package d_hashmap.revisao1.e45;

import java.util.HashMap;
import java.util.Map;

public class FiltroMaisIf {
    // Crie um novo Map contendo apenas os produtos com estoque abaixo de 10. Esses são os que precisam de reposição.

    static void main() {
        Map<String, Integer> estoque = Map.of("arroz", 50, "feijão", 5, "macarrão", 30, "sal", 2, "açúcar", 8);

        Map<String, Integer> abaixo = new HashMap<>();

        for (Map.Entry<String, Integer> entry: estoque.entrySet()) {
            if (entry.getValue() < 10) abaixo.put(entry.getKey(),entry.getValue());
        }
        System.out.println(abaixo);
    }
}
