package d_hashmap.extras.e45;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnaliseDeEstoque {
    //O mercado precisa de um relatório de estoque. Dado os dados abaixo, descubra:
    // quais produtos precisam de reposição (estoque abaixo de 10),
    // qual fornecedor fornece mais produtos, e o total de itens em estoque.


    static void main() {
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("Arroz", 25);
        estoque.put("Feijão", 8);
        estoque.put("Café", 3);
        estoque.put("Leite", 30);
        estoque.put("Sal", 5);
        estoque.put("Suco", 15);

        Map<String, String> fornecedores = new HashMap<>();
        fornecedores.put("Arroz", "Fornecedor A");
        fornecedores.put("Feijão", "Fornecedor A");
        fornecedores.put("Café", "Fornecedor B");
        fornecedores.put("Leite", "Fornecedor B");
        fornecedores.put("Sal", "Fornecedor A");
        fornecedores.put("Suco", "Fornecedor B");

        List<String> reposicao = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int totalEstoque = 0;

        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            if (entry.getValue() < 10) {
                reposicao.add(entry.getKey());
            }
            totalEstoque += entry.getValue();
        }

//        for (Map.Entry<String, String> entry: fornecedores.entrySet()) {
//            if (map.containsKey(entry.getValue())){
//                map.put(entry.getValue(), map.get(entry.getValue())+1);
//            } else map.put(entry.getValue(), 1);
//        }

        for (Map.Entry<String, String> entry : fornecedores.entrySet()) {
            map.merge(entry.getValue(), 1, (antigo, novo) -> antigo + novo);
        }

        String maiorFornecedor = "";
        int maiorQtd = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maiorQtd) {
                maiorQtd = entry.getValue();
                maiorFornecedor = entry.getKey();
            }
        }



        System.out.println("Reposição necessária: " + reposicao);
        System.out.println("Fornecedor com mais produtos: " + maiorFornecedor + " (" + maiorQtd + ")");
        System.out.println("Total em estoque: " + totalEstoque + " itens");


    }

}
