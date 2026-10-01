package d_hashmap.revisao1.e72;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentMaisMaior {
    //Um fórum de anime registrou as avaliações por usuário: {"Junior"-9.5, "Ana"-8.0, "Junior"-7.5, "Carlos"-9.0, "Ana"-9.5, "Junior"-8.5, "Carlos"-7.0, "Ana"-6.5}.
    // Agrupe as notas por usuário numa List (usando computeIfAbsent). Depois, encontre a maior nota que cada usuário deu.

    static void main() {
        List<String> nomes = List.of("Junior", "Ana", "Junior", "Carlos", "Ana", "Junior", "Carlos", "Ana");
        List<Double> notas = List.of(9.5, 8.0, 7.5, 9.0, 9.5, 8.5, 7.0, 6.5);

        Map<String, List<Double>> agrupado = new HashMap<>();

        for (int i = 0; i < nomes.size(); i++) {
            agrupado.computeIfAbsent(nomes.get(i), k -> new ArrayList<>()).add(notas.get(i));
        }

        System.out.println("Notas: " + agrupado);

        for (Map.Entry<String, List<Double>> entry: agrupado.entrySet()) {
            String usuario = entry.getKey();
            List<Double> notasPorUsuario = entry.getValue();
            double maiorNotaUsuario = 0.0;

            for (double n:notasPorUsuario) {
                if (n > maiorNotaUsuario) {
                    maiorNotaUsuario = n;
                }
            }

            System.out.println("Maior - " + usuario + ": " + maiorNotaUsuario);

        }
    }
}






