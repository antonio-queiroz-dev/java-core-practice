package d_hashmap.revisao1.e42;

import java.util.Map;

public class maiorValorComEntrySet {
    // Descubra qual vendedor vendeu mais e imprima só o nome dele. Use entrySet.

    static void main() {
        Map<String, Integer> vendas = Map.of("Ana", 330, "Bruno", 250, "Carla", 300);
        String mais = "";
        int maior = 0;

        for (Map.Entry<String, Integer> entry: vendas.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
                mais = entry.getKey();
            }
        }

        System.out.println(mais);
    }
}
