package hashmapExtras.h16;

import java.util.HashMap;
import java.util.Map;

public class AlunosAprovadosPorMatéria {
    static void main() {
        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 8.5);
        notas.put("Carlos", 5.0);
        notas.put("Maria", 9.2);
        notas.put("João", 6.5);
        notas.put("Pedro", 7.0);

        HashMap<String, Double> aprovados = new HashMap<>();
        HashMap<String, Double> reprovados = new HashMap<>();
        Double notaAprovacao = 7.0;

        for (Map.Entry<String, Double> entry: notas.entrySet()) {
            if (entry.getValue() >= notaAprovacao) {
                aprovados.put(entry.getKey(),entry.getValue());
            } else reprovados.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }
}
