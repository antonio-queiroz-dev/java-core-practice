package d_hashmap.extras.e39;

import java.util.HashMap;
import java.util.Map;

public class MaiorSalarioPorSetor {
    static void main() {

        Map<String, Double> salarios = new HashMap<>();
        salarios.put("Ana", 3500.0);
        salarios.put("Carlos", 4200.0);
        salarios.put("Maria", 5100.0);
        salarios.put("João", 3800.0);
        salarios.put("Pedro", 4800.0);

        Map<String, String> setores = new HashMap<>();
        setores.put("Ana", "Financeiro");
        setores.put("Carlos", "Financeiro");
        setores.put("Maria", "TI");
        setores.put("João", "TI");
        setores.put("Pedro", "Financeiro");

        Map<String, Double> maiorSalarioVendedor = new HashMap<>();
        Map<String, String> maiorSalarioEquipe = new HashMap<>();
        
        for (Map.Entry<String, Double> entry: salarios.entrySet()) {
            String vendedor = entry.getKey();
            double salario = entry.getValue();
            String setor = setores.get(vendedor);
            
            if (!maiorSalarioVendedor.containsKey(setor)) {
                maiorSalarioVendedor.put(setor,salario);
                maiorSalarioEquipe.put(setor,vendedor);
            } else if (salario > maiorSalarioVendedor.get(setor)) {
                maiorSalarioVendedor.put(setor,salario);
                maiorSalarioEquipe.put(setor,vendedor);
            }
        }

        for (Map.Entry<String, Double> entry: maiorSalarioVendedor.entrySet()) {
            System.out.println(entry.getKey() + " → " + maiorSalarioEquipe.get(entry.getKey()) + " (R$" + entry.getValue() + ")");
        }
    }
}
