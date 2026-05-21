package hashmapExtras.h1;

import java.util.HashMap;
import java.util.Map;

public class ProdutoMaisCaro {
    static void main() {


        Map<String, Double> precos = new HashMap<>();
        precos.put("Arroz", 22.90);
        precos.put("Feijão", 8.50);
        precos.put("Café", 15.00);
        precos.put("Açúcar", 4.75);
        precos.put("Leite", 6.30);

        String maior = "";
        Double maiorValor = 0.0;

        for (Map.Entry<String, Double> entry : precos.entrySet()) {
            if (entry.getValue() > maiorValor) {
                maior = entry.getKey();
                maiorValor = entry.getValue();
            }
        }

        System.out.printf("Produto: %s Valor: R$%.2f%n", maior, maiorValor);
    }


}
