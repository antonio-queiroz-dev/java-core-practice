package d_hashmap.revisao1.e70;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentMaisMerge {
    //Um streaming registrou os animes assistidos e o tempo gasto por usuário: {"Junior"-45, "Ana"-30, "Junior"-60, "Carlos"-90, "Ana"-50, "Junior"-35, "Carlos"-40, "Ana"-70} (minutos por sessão). Faça duas coisas:
    //
    //Agrupe os tempos por usuário numa List (usando computeIfAbsent)
    //Calcule o total de minutos de cada usuário (usando merge com Integer::sum)

    static void main() {
        List<String> nomes = List.of("Junior", "Ana", "Junior", "Carlos", "Ana", "Junior", "Carlos", "Ana");
        List<Integer> valores = List.of(45, 30, 60, 90, 50, 35, 40, 70);

        Map<String,List<Integer>> sessoes = new HashMap<>();
        Map<String,Integer> total = new HashMap<>();

        for (int i = 0; i < nomes.size(); i++) {
            sessoes.computeIfAbsent(nomes.get(i),k-> new ArrayList<>()).add(valores.get(i));
        }

        for (int i = 0; i < nomes.size(); i++) {
            total.merge(nomes.get(i),valores.get(i),(a, n)-> a + n);
        }

        System.out.println("Sessões: " + sessoes);
        System.out.println("Total: " + total);
    }
}
