package d_hashmap.revisao1.e63;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentMaisMaiorPorGrupo {
    // Uma escola registrou as notas dos alunos em provas:
    // {"Ana"-8.5, "Carlos"-6.0, "Ana"-7.0, "Carlos"-9.0, "Maria"-5.5, "Ana"-9.5, "Maria"-7.5, "Carlos"-4.0}.
    // Agrupe as notas por aluno numa List (usando computeIfAbsent). Depois, percorra o mapa e encontre a maior nota de cada aluno.

    static void main() {
        String[] alunos = {"Ana", "Carlos", "Ana", "Carlos", "Maria", "Ana", "Maria", "Carlos"};
        double[] notas = {8.5, 6.0, 7.0, 9.0, 5.5, 9.5, 7.5, 4.0};

        Map<String, List<Double>> notasPorAluno = new HashMap<>();

        for (int i = 0; i < alunos.length; i++) {
            notasPorAluno.computeIfAbsent(alunos[i],k -> new ArrayList<>()).add(notas[i]);
        }

        System.out.println("Notas: " + notasPorAluno);

        for (Map.Entry<String, List<Double>> entry: notasPorAluno.entrySet()) {

            String aluno = entry.getKey();
            List<Double> notasAlunos = entry.getValue();
            double maiorNota = 0.0;

            for (double n: notasAlunos) {
                if (n > maiorNota) {
                    maiorNota = n;
                }
            }
            // maiorNota = Collections.max(notasAlunos); uma outra forma que aprendi pesquisando

            System.out.println("Maior nota - " + aluno + ": " + maiorNota);

        }
    }
}
