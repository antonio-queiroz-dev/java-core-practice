package d_hashmap.revisao1.e27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExercícioLivreCombinado {
    // Dado um registro de compras, descubra o cliente que mais comprou e liste os produtos que ele comprou (sem repetir).
    static void main() {
        String[] clientes = {"Ana", "Carlos", "Ana", "Carlos", "Ana", "Maria", "Carlos"};
        String[] produtos = {"Arroz", "Café", "Feijão", "Arroz", "Café", "Leite", "Feijão"};

        Map<String, Integer> quantidadeCompras = new HashMap<>();
        Map<String, List<String>> listaCompras = new HashMap<>();

        for (int i = 0; i < clientes.length; i++) {
            quantidadeCompras.put(clientes[i],quantidadeCompras.getOrDefault(clientes[i],0)+1);
        }

        for (int i = 0; i < clientes.length; i++) {
            listaCompras.computeIfAbsent(clientes[i], k-> new ArrayList<>());
            if (!listaCompras.get(clientes[i]).contains(produtos[i])) {
                listaCompras.get(clientes[i]).add(produtos[i]);
            }
        }

        String maiorComprador = "";
        int vezesMaiorComprador = 0;
        List<String> lista = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: quantidadeCompras.entrySet()) {
            if (entry.getValue() > vezesMaiorComprador) {
                maiorComprador = entry.getKey();
                vezesMaiorComprador = entry.getValue();
                lista = listaCompras.get(entry.getKey());
            }
        }

        System.out.println("Cliente que mais comprou: " + maiorComprador + " (" + vezesMaiorComprador +"compras)");
        System.out.println("Produtos de(a) " + maiorComprador + ": " + lista );
    }
}
