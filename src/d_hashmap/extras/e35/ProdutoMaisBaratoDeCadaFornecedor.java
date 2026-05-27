package d_hashmap.extras.e35;

import java.util.HashMap;
import java.util.Map;

public class ProdutoMaisBaratoDeCadaFornecedor {
    static void main() {

        Map<String, Double> precos = new HashMap<>();
        precos.put("Arroz", 22.90);
        precos.put("Feijão", 8.50);
        precos.put("Café", 15.00);
        precos.put("Leite", 6.30);
        precos.put("Sal", 3.50);
        precos.put("Suco", 12.00);

        Map<String, String> fornecedores = new HashMap<>();
        fornecedores.put("Arroz", "Fornecedor A");
        fornecedores.put("Feijão", "Fornecedor A");
        fornecedores.put("Café", "Fornecedor B");
        fornecedores.put("Leite", "Fornecedor B");
        fornecedores.put("Sal", "Fornecedor A");
        fornecedores.put("Suco", "Fornecedor B");

        Map<String, Double> menorPreco = new HashMap<>();
        Map<String, String> menorProduto = new HashMap<>();

        for (Map.Entry<String, Double> entry : precos.entrySet()) {
            String produto = entry.getKey();        // "Arroz"
            Double preco = entry.getValue();         // 22.90
            String fornecedor = fornecedores.get(produto);  // "Fornecedor A"

            if (!menorPreco.containsKey(fornecedor)) {
                // fornecedor novo: guarda direto
                menorPreco.put(fornecedor, preco);
                menorProduto.put(fornecedor, produto);
            } else if (preco < menorPreco.get(fornecedor)) {
                // fornecedor já existe mas achei preço menor: troca
                menorPreco.put(fornecedor, preco);
                menorProduto.put(fornecedor, produto);
            }

        }

        for (Map.Entry<String, Double> entry: menorPreco.entrySet()) {
            System.out.println("Fornecedor: " + entry.getKey() + " → " + menorProduto.get(entry.getKey()) + " R$"+ entry.getValue());
        }

    }
}
