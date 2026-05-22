package hashmapExtras.h11;

import java.util.HashMap;
import java.util.Map;

public class ProdutoComMaiorEstoque {
    static void main() {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Arroz", 45);
        estoque.put("Feijão", 30);
        estoque.put("Café", 60);
        estoque.put("Açúcar", 25);
        estoque.put("Leite", 50);

        String mais = "";
        int maior = 0;

        for (Map.Entry<String, Integer> entry: estoque.entrySet()){
            if (entry.getValue() > maior){
                mais = entry.getKey();
                maior = entry.getValue();
            }
        }

        System.out.println("Maior estoque: " + mais + " — " + maior + " unidadess ");
    }
}
