package d_hashmap.revisao1.e68;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentContagem {
    //Um mercado registrou os produtos comprados por cliente:
    // {"Ana"-"Arroz", "Carlos"-"Leite", "Ana"-"Feijão", "Maria"-"Arroz", "Carlos"-"Arroz", "Ana"-"Leite", "Maria"-"Café"}.
    // Agrupe os produtos por cliente numa List (usando computeIfAbsent). Depois, imprima quantos produtos cada cliente comprou.

    static void main() {
        List<String> pessoas = List.of("Ana", "Carlos", "Ana", "Maria", "Carlos", "Ana", "Maria");
        List<String> produtos = List.of("Arroz", "Leite", "Feijão", "Arroz", "Arroz", "Leite", "Café");

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < pessoas.size(); i++) {
            map.computeIfAbsent(pessoas.get(i), k -> new ArrayList<>()).add(produtos.get(i));
        }

        System.out.println(map);
        for (Map.Entry<String,List<String>> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " produtos");
        }
    }

}