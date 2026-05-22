package d_hashmap.extras.e20;

import java.util.HashMap;
import java.util.Map;

public class TotalDeProdutosPorFaixaDePreco {
    static void main() {

        Map<String, Double> precos = new HashMap<>();
        precos.put("Arroz", 22.90);
        precos.put("Feijão", 8.50);
        precos.put("Café", 15.00);
        precos.put("Açúcar", 4.75);
        precos.put("Leite", 6.30);
        precos.put("Picanha", 55.00);
        precos.put("Sal", 3.50);

        HashMap<String, Integer> quantFaixa = new HashMap<>();

        for (Map.Entry<String, Double> entry: precos.entrySet()) {
           String faixa;
           if (entry.getValue() <= 10) {
               faixa = "Barato";
           } else if (entry.getValue() <= 20) {
               faixa = "Medio";
           } else {
               faixa = "Caro";
           }

           if (quantFaixa.containsKey(faixa)){
               quantFaixa.put(faixa,quantFaixa.get(faixa)+1);
           } else quantFaixa.put(faixa,1);
        }

        System.out.println(quantFaixa);
    }
}
