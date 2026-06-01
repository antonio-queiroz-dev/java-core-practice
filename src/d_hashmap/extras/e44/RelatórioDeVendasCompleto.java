package d_hashmap.extras.e44;

//Dado o registro de vendas, gere um relatório com:
// total de cada vendedor, quem vendeu mais, e quem vendeu menos.

import java.util.HashMap;
import java.util.Map;

public class RelatórioDeVendasCompleto {
    public static void main(String[] args) {
        String[] vendedores = {"Ana", "Carlos", "Maria", "Ana", "Carlos", "Maria", "Ana", "Maria"};
        double[] valores = {200.0, 150.0, 300.0, 100.0, 250.0, 180.0, 50.0, 220.0};

        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < vendedores.length; i++) {
            map.merge(vendedores[i],valores[i],(antigo, novo) -> antigo + novo); {
            }
        }

//        for (int i = 0; i < vendedores.length; i++) {
//            if (map.containsKey(vendedores[i])){
//                map.put(vendedores[i],map.get(vendedores[i]) + valores[i]);
//            } else map.put(vendedores[i],valores[i]);
//        }

        double maiorVenda = Integer.MIN_VALUE;
        String maiorVendedor = "";
        double menorVenda = Integer.MAX_VALUE;
        String menorVendedor = "";


        for (Map.Entry<String, Double> entry: map.entrySet()) {
            if (entry.getValue() > maiorVenda) {
                maiorVenda = entry.getValue();
                maiorVendedor = entry.getKey();
            }
            if (entry.getValue() < menorVenda) {
                menorVenda = entry.getValue();
                menorVendedor = entry.getKey();
            }
            System.out.println(entry.getKey() + " → R$" + entry.getValue());
        }
        System.out.println("Maior vendedor: " + maiorVendedor + " (R$" + maiorVenda + ")");
        System.out.println("Menor vendedor: " + menorVendedor + " (R$" + menorVenda + ")");
    }
}
