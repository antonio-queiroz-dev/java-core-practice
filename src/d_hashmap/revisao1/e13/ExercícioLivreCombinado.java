package d_hashmap.revisao1.e13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercícioLivreCombinado {
    // Um mercado registrou vendas da semana. Descubra: quanto cada produto vendeu no total,
    // qual produto vendeu menos, e agrupe os produtos por faixa de vendas
    // ("Baixo" até 100, "Alto" acima de 100).

    static void main() {
        String[] produtos = {"Arroz", "Café", "Arroz", "Feijão", "Café", "Arroz", "Feijão"};
        double[] valores = {45.0, 30.0, 60.0, 25.0, 50.0, 35.0, 40.0};

        Map<String, Double> vendas = new HashMap<>();

        for (int i = 0; i < produtos.length; i++) {
            vendas.merge(produtos[i],valores[i], (antigo, novo) -> antigo + novo);
        }

        String menosVenda = "";
        double menorVenda = Integer.MAX_VALUE;
        List<String> baixo = new ArrayList<>();
        List<String> alto = new ArrayList<>();

        for (Map.Entry<String, Double> entry: vendas.entrySet()) {

            if (entry.getValue() < menorVenda) {
                menosVenda = entry.getKey();
                menorVenda = entry.getValue();
            }
            if (entry.getValue() <= 100) {
                baixo.add(entry.getKey());
            } else alto.add(entry.getKey());

            System.out.println(entry.getKey() + " → R$ " + entry.getValue());

        }

        System.out.println("Menor vendas: " + menosVenda + " (R$" + menorVenda + ")");
        System.out.println("Baixo → " + baixo);
        System.out.println("Alto → " + alto);
    }
}
