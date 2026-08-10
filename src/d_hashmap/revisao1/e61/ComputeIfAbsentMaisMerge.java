package d_hashmap.revisao1.e61;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentMaisMerge {
    // Um mercado registrou as vendas por vendedor durante a semana:
    //
    //{"Ana"-45.0, "Carlos"-30.0, "Ana"-60.0, "Carlos"-25.0, "Maria"-80.0, "Ana"-35.0, "Maria"-55.0, "Carlos"-40.0}
    //
    //Faça duas coisas:
    //
    //Agrupe os valores de venda por vendedor numa List (usando computeIfAbsent)
    //Num segundo mapa, calcule o total vendido por cada vendedor (usando merge)

    static void main() {
        List<String> nomes = List.of("Ana", "Carlos", "Ana", "Carlos", "Maria", "Ana", "Maria", "Carlos");
        List<Double> valores = List.of(45.0, 30.0, 60.0, 25.0, 80.0, 35.0, 55.0, 40.0);

        Map<String, List<Double>> agrupado = new HashMap<>();
        Map<String, Double> total = new HashMap<>();

        for (int i = 0; i < nomes.size(); i++) {
            agrupado.computeIfAbsent(nomes.get(i), k -> new ArrayList<>()).add(valores.get(i));
        }

        for (int i = 0; i < nomes.size(); i++) {
            total.merge(nomes.get(i), valores.get(i), (antigo, novo) -> antigo + novo);
        }

        System.out.println("Vendas: " + agrupado);
        System.out.println("Vendas: " + total);

    }
}
