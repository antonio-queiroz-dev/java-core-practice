package hashmapExtras.h15;

import java.util.HashMap;
import java.util.Map;

public class VendedorComMaisVendas {
    static void main() {
        Map<String, Integer> vendas = new HashMap<>();
        vendas.put("Ana", 15);
        vendas.put("Carlos", 8);
        vendas.put("Maria", 22);
        vendas.put("João", 5);
        vendas.put("Pedro", 18);

        String mais = "";
        int maior = Integer.MIN_VALUE;
        String menos = "";
        int menor = Integer.MAX_VALUE;


        for (Map.Entry<String, Integer> entry: vendas.entrySet()){
            if (entry.getValue() > maior) {
                mais = entry.getKey();
                maior = entry.getValue();
            }
            if (entry.getValue() < menor) {
                menos = entry.getKey();
                menor = entry.getValue();
            }
        }

        System.out.println("Mais vendas: " + mais + " - " + maior);
        System.out.println("Menos vendas: " + menos + " - " + menor);

    }
}
