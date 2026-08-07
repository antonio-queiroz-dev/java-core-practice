package d_hashmap.revisao1.e60;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsent {
    // Um mercado registrou quais clientes compraram quais produtos:
    // {"Ana"-"Arroz", "Carlos"-"Feijão", "Ana"-"Leite", "Carlos"-"Arroz", "Maria"-"Café", "Ana"-"Café", "Maria"-"Arroz"}.
    // Agrupe os produtos por cliente numa List.

    static void main() {
        List<String> compradores = List.of("Ana", "Carlos", "Ana", "Carlos", "Maria", "Ana", "Maria");
        List<String> produtos = List.of("Arroz", "Feijão", "Leite", "Arroz", "Café","Café", "Arroz");

        Map<String, List<String>> resultado = new HashMap<>();

        for (int i = 0; i < compradores.size(); i++) {
            resultado.computeIfAbsent(compradores.get(i), k -> new ArrayList<>()).add(produtos.get(i));
        }

        System.out.println(resultado);
    }
}
