package d_hashmap.extras.e32;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparFuncionariosPorDepartamentoEContar {
    static void main() {

        Map<String, String> funcionarios = new HashMap<>();
        funcionarios.put("Ana", "TI");
        funcionarios.put("Carlos", "RH");
        funcionarios.put("Maria", "TI");
        funcionarios.put("João", "Vendas");
        funcionarios.put("Pedro", "RH");
        funcionarios.put("Lucas", "TI");
        funcionarios.put("Julia", "Vendas");

        Map<String, List<String>> map = new HashMap<>();

        for (Map.Entry<String, String> entry: funcionarios.entrySet()) {
            if (map.containsKey(entry.getValue())) {
                map.get(entry.getValue()).add(entry.getKey());
            } else {
                List<String> nomes = new ArrayList<>();
                nomes.add(entry.getKey());
                map.put(entry.getValue(),nomes);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " (" + entry.getValue().size() + " funcionários)");
        }

        System.out.println(map);
    }
}
