package d_hashmap.extras.e28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparVendedoresPorFaixaDeVendas {
    static void main() {

        Map<String, Double> vendas = new HashMap<>();
        vendas.put("Ana", 320.0);
        vendas.put("Carlos", 80.0);
        vendas.put("Maria", 250.0);
        vendas.put("João", 150.0);
        vendas.put("Pedro", 50.0);
        vendas.put("Lucas", 400.0);

        HashMap<String, List<String>> map = new HashMap<>();

        for (Map.Entry<String,Double> entry: vendas.entrySet()) {
            String faixa;

            if (entry.getValue() <= 100){
                faixa = "Baixo";
            } else if (entry.getValue() <= 300) {
                faixa = "Medio";
            } else faixa = "Alto";

            if (map.containsKey(faixa)){
                map.get(faixa).add(entry.getKey());
            } else {
                List<String> nomes = new ArrayList<>();
                nomes.add(entry.getKey());
                map.put(faixa, nomes);
            }
        }

        System.out.println(map);
    }
}
