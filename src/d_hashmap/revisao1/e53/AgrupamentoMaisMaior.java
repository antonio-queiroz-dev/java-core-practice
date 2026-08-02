package d_hashmap.revisao1.e53;

import java.util.HashMap;
import java.util.Map;

public class AgrupamentoMaisMaior {
    // Um mercado registrou vendas do dia: {"arroz", "feijão", "arroz", "macarrão", "feijão", "arroz", "leite", "feijão", "macarrão"}.
    // Agrupe por produto e conte quantas vezes cada um foi vendido. Depois, encontre o produto mais vendido.

    static void main() {
        String[] vendas = {"arroz", "feijão", "arroz", "macarrão", "feijão", "arroz", "leite", "feijão", "macarrão"};

        Map<String, Integer> map = new HashMap<>();

        for (String v: vendas) {
            map.put(v,map.getOrDefault(v,0)+1);
        }
        System.out.println(map);

        String maisVendido = "";
        int maisVendidoQuant = 0;
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maisVendidoQuant) {
                maisVendidoQuant = entry.getValue();
                maisVendido = entry.getKey();
            }
        }

        System.out.println("Mais vendido: " + maisVendido + " (" +maisVendidoQuant + " vendas)");
    }
}
