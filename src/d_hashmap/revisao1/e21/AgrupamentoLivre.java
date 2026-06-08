package d_hashmap.revisao1.e21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoLivre {
    // Agrupe os vendedores por região e diga quantos tem em cada uma.
    static void main() {
        Map<String, String> vendedores = new HashMap<>();
        vendedores.put("Ana", "Norte");
        vendedores.put("Carlos", "Sul");
        vendedores.put("Maria", "Norte");
        vendedores.put("João", "Sul");
        vendedores.put("Pedro", "Norte");
        vendedores.put("Lucas", "Leste");

        Map<String, List<String>> agrupadoPorRegiao = new HashMap<>();

        for (Map.Entry<String, String> entry: vendedores.entrySet()) {
            agrupadoPorRegiao.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        for (Map.Entry<String, List<String>> entry: agrupadoPorRegiao.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " (" + entry.getValue().size() + " vendedores)");
        }
    }
}
