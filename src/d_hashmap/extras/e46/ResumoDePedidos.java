package d_hashmap.extras.e46;

import java.util.HashMap;
import java.util.Map;

public class ResumoDePedidos {
    //Um restaurante registrou pedidos do dia. Gere um relatório com:
    // quantas vezes cada prato foi pedido, qual foi o prato mais pedido, e o total de pedidos.
    static void main() {
        String[] pedidos = {"Pizza", "Hambúrguer", "Pizza", "Salada", "Pizza", "Hambúrguer", "Sushi", "Salada", "Pizza", "Sushi", "Sushi"};

        Map<String, Integer> map = new HashMap<>();

//        for (int i = 0; i < pedidos.length; i++) {
//            if (map.containsKey(pedidos[i])){
//                map.put(pedidos[i],map.get(pedidos[i])+1);
//            } else map.put(pedidos[i],1);
//        }

        for (int i = 0; i < pedidos.length; i++) {
            map.merge(pedidos[i],1,(antigo, novo) -> antigo + novo);
        }

        int quantidadePedidos = 0;
        int maiorPedido = 0;
        String maisPedido = "";


        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            quantidadePedidos += entry.getValue();
            if (entry.getValue() > maiorPedido){
                maiorPedido = entry.getValue();
                maisPedido = entry.getKey();
            }
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("Prato mais pedido: " + maisPedido + "(" + maiorPedido + " vezes)");
        System.out.println("Total de pedidos: " + quantidadePedidos);

    }
}
