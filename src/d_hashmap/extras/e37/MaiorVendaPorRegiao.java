package d_hashmap.extras.e37;

import java.util.HashMap;
import java.util.Map;

public class MaiorVendaPorRegiao {
    static void main() {

        Map<String, Double> vendas = new HashMap<>();
        vendas.put("Ana", 500.0);
        vendas.put("Carlos", 300.0);
        vendas.put("Maria", 800.0);
        vendas.put("João", 450.0);
        vendas.put("Pedro", 600.0);

        Map<String, String> regioes = new HashMap<>();
        regioes.put("Ana", "Norte");
        regioes.put("Carlos", "Norte");
        regioes.put("Maria", "Sul");
        regioes.put("João", "Sul");
        regioes.put("Pedro", "Norte");

        Map<String, Double> maiorVenda = new HashMap<>();
        Map<String, String> vendedorMaiorVenda = new HashMap<>();

        for (Map.Entry<String, Double> entry: vendas.entrySet()) {
            String vendedor = entry.getKey();
            double valor = entry.getValue();
            String regiao = regioes.get(vendedor);

            if (!maiorVenda.containsKey(regiao)) {
                maiorVenda.put(regiao,valor);
                vendedorMaiorVenda.put(regiao,vendedor);
            } else if (valor > maiorVenda.get(regiao)) {
                maiorVenda.put(regiao,valor);
                vendedorMaiorVenda.put(regiao,vendedor);
            }
        }

        for (Map.Entry<String, Double> entry: maiorVenda.entrySet()) {
            System.out.println(entry.getKey() + " → " + vendedorMaiorVenda.get(entry.getKey()) + "(" + entry.getValue() + ")");
        }
    }
}
