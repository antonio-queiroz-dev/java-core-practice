package d_hashmap.extras.e33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartamentoComMaisFuncionários {
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

        int maior = Integer.MIN_VALUE;
        String mais = " ";

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > maior) {
                maior = entry.getValue().size();
                mais = entry.getKey();
            }
        }

        System.out.println("Maior departamento: " + mais + " — " + maior + " funcionários");

    }
}
