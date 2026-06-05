package d_hashmap.extras.e47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelatórioEscolarCompleto {
    //Gere um relatório com: alunos agrupados por turma, média de cada turma,
    // melhor aluno de cada turma, e quantos alunos foram reprovados (nota < 6) no total.

    public static void main(String[] args) {
        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 8.5);
        notas.put("Carlos", 4.0);
        notas.put("Maria", 9.2);
        notas.put("João", 5.5);
        notas.put("Pedro", 7.0);
        notas.put("Lucas", 3.0);

        Map<String, String> turmas = new HashMap<>();
        turmas.put("Ana", "A");
        turmas.put("Carlos", "A");
        turmas.put("Maria", "B");
        turmas.put("João", "B");
        turmas.put("Pedro", "A");
        turmas.put("Lucas", "B");


        Map<String, List<String>> nomesPorTurma = new HashMap<>();
        Map<String, Double> notaTotalPorTurma = new HashMap<>();
        Map<String, String> melhorAlunoPorTurma = new HashMap<>();
        Map<String, Double> melhorNotaPorTurma = new HashMap<>();
        int quantidadeReprovados = 0;

        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            String aluno = entry.getKey();
            double nota = entry.getValue();
            String turma = turmas.get(aluno);

            if (nomesPorTurma.containsKey(turma)) {
                nomesPorTurma.get(turma).add(aluno);
            } else {
                List<String> list = new ArrayList<>();
                list.add(aluno);
                nomesPorTurma.put(turma, list);
            }

            notaTotalPorTurma.merge(turma,nota,(antigo, novo) -> antigo + novo);

            if (!melhorNotaPorTurma.containsKey(turma)) {
                melhorNotaPorTurma.put(turma, nota);
                melhorAlunoPorTurma.put(turma, aluno);
            } else if (nota > melhorNotaPorTurma.get(turma)) {
                melhorNotaPorTurma.put(turma, nota);
                melhorAlunoPorTurma.put(turma, aluno);
            }

            if (nota < 6) {
                quantidadeReprovados++;
            }


        }

        for (Map.Entry<String, List<String>> entry : nomesPorTurma.entrySet()) {
            String turma = entry.getKey();
            double media = notaTotalPorTurma.get(turma) / entry.getValue().size();

            System.out.println("Turma " + turma + ": " + entry.getValue());
            System.out.println("Turma " + turma + " média: " + media);
            System.out.println("Melhor aluno turma " + turma + ": " + melhorAlunoPorTurma.get(turma) + " (" + melhorNotaPorTurma.get(turma) + ")");
            System.out.println();
        }

        System.out.println("Reprovados no total: " + quantidadeReprovados);
    }
}
