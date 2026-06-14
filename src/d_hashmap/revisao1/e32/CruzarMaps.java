package d_hashmap.revisao1.e32;

import java.util.HashMap;
import java.util.Map;

public class CruzarMaps {
    // Dado um Map de alunos e notas, e outro de alunos e turmas, calcule a média de cada turma:
    static void main() {
        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 8.0);
        notas.put("Carlos", 6.0);
        notas.put("Maria", 9.0);
        notas.put("João", 7.0);

        Map<String, String> turmas = new HashMap<>();
        turmas.put("Ana", "A");
        turmas.put("Carlos", "A");
        turmas.put("Maria", "B");
        turmas.put("João", "B");

        Map<String, Double> notasTurma = new HashMap<>();
        Map<String, Integer> quantAlunosTurma = new HashMap<>();

        for (Map.Entry<String, Double> entry: notas.entrySet()) {
            String aluno = entry.getKey();
            double nota = entry.getValue();
            String turmaAluno = turmas.get(aluno);

            notasTurma.put(turmaAluno,notasTurma.getOrDefault(turmaAluno,0.0)+nota);
            quantAlunosTurma.put(turmaAluno,quantAlunosTurma.getOrDefault(turmaAluno,0)+1);
        }

        for (Map.Entry<String, Double> entry: notasTurma.entrySet()) {
            double media = entry.getValue() / quantAlunosTurma.get(entry.getKey());
            System.out.println("Turma " + entry.getKey() + ": média " + media);
        }
    }
}
