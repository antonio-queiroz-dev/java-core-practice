package d_hashmap.revisao1.e12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoComListLivre {
    //Dado o registro de compras, agrupe os produtos comprados por cada cliente.
    public static void main(String[] args) {
        String[] clientes = {"Ana", "Carlos", "Ana", "Maria", "Carlos"};
        String[] produtos = {"Arroz", "Café", "Feijão", "Leite", "Açúcar"};

        Map<String, List<String>> listaProdutos = new HashMap<>();

        for (int i = 0; i < clientes.length; i++) {
            if (listaProdutos.containsKey(clientes[i])) {
                listaProdutos.get(clientes[i]).add(produtos[i]);
            } else {
                List<String> lista = new ArrayList<>();
                lista.add(produtos[i]);
                listaProdutos.put(clientes[i], lista);
            }
        }

//        for (int i = 0; i < clientes.length; i++) {
//            List<String> lista = new ArrayList<>();
//            listaProdutos.computeIfAbsent(clientes[i], k -> new ArrayList<>()).add(produtos[i]);
//        }

        System.out.println(listaProdutos);
    }
}
