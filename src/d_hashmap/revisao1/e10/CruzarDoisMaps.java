package d_hashmap.revisao1.e10;

import java.util.HashMap;
import java.util.Map;

public class CruzarDoisMaps {
    //Dado um Map de funcionários e salários, e outro de funcionários e departamentos,
    // encontre o funcionário com menor salário de cada departamento.
    public static void main(String[] args) {
        Map<String, Double> salarios = new HashMap<>();
        salarios.put("Ana", 3000.0);
        salarios.put("Carlos", 5000.0);
        salarios.put("Maria", 2800.0);
        salarios.put("João", 4500.0);
        salarios.put("Pedro", 3200.0);

        Map<String, String> departamentos = new HashMap<>();
        departamentos.put("Ana", "TI");
        departamentos.put("Carlos", "TI");
        departamentos.put("Maria", "RH");
        departamentos.put("João", "RH");
        departamentos.put("Pedro", "TI");

        Map<String,String> menorSalarioFuncionarioDepartamento = new HashMap<>();
        Map<String,Double> menorSalarioDepartamento = new HashMap<>();

        for (Map.Entry<String, Double> entry: salarios.entrySet()) {
            String funcionario = entry.getKey();
            double salario = entry.getValue();
            String departamento = departamentos.get(entry.getKey());

            if (!menorSalarioDepartamento.containsKey(departamento)) {
                menorSalarioFuncionarioDepartamento.put(departamento,funcionario);
                menorSalarioDepartamento.put(departamento,salario);
            } else if (salario < menorSalarioDepartamento.get(departamento)) {
                menorSalarioFuncionarioDepartamento.put(departamento,funcionario);
                menorSalarioDepartamento.put(departamento,salario);
            }
        }

        for (Map.Entry<String, String> entry: menorSalarioFuncionarioDepartamento.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " (" + menorSalarioDepartamento.get(entry.getKey()) + ")");
        }
    }
}
