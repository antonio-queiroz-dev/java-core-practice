package d_hashmap.revisao1.e67;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeContagemMaisFiltro {
    // Uma loja registrou os métodos de pagamento:
    // {"Pix", "Cartão", "Pix", "Dinheiro", "Cartão", "Pix", "Cartão", "Cartão", "Dinheiro", "Pix"}.
    // Conte com merge + Integer::sum. Depois, filtre e imprima só os que tiveram 3 ou mais usos.

    public static void main(String[] args) {
        List<String> metodos = List.of("Pix", "Cartão", "Pix", "Dinheiro", "Cartão", "Pix", "Cartão", "Cartão", "Dinheiro", "Pix");

        Map<String, Integer> map = new HashMap<>();

        for (String s: metodos) {
            map.merge(s,1, Integer::sum);
        }


        Map<String, Integer > mais3Uso = new HashMap<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() >= 3) {
                mais3Uso.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Todos: " + map);
        System.out.println("3+ usos: " + mais3Uso);
    }
}
