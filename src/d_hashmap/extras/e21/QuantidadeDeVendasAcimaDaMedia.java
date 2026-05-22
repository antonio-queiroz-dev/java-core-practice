package d_hashmap.extras.e21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QuantidadeDeVendasAcimaDaMedia {
    static void main() {

        Map<String, Double> vendas = new HashMap<>();
        vendas.put("Ana", 150.0);
        vendas.put("Carlos", 200.0);
        vendas.put("Maria", 80.0);
        vendas.put("João", 300.0);
        vendas.put("Pedro", 120.0);

        double media;
        double total = 0;
        for (Map.Entry<String, Double> entry : vendas.entrySet()) {
            total += entry.getValue();
        }

        media = total / vendas.size();

        List<String> acima = new ArrayList<>();

        for (Map.Entry<String, Double> entry : vendas.entrySet()) {
            if (entry.getValue() >= media) {
                acima.add(entry.getKey());
            }
        }
        System.out.println("Media geral: " + media);
        System.out.println("Acima da média: " + acima.size() + " " + acima);
    }
}