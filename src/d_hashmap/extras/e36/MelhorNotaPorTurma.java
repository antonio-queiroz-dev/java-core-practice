package d_hashmap.extras.e36;

import java.util.HashMap;
import java.util.Map;

public class MelhorNotaPorTurma {
    static void main() {

        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 8.5);
        notas.put("Carlos", 6.0);
        notas.put("Maria", 9.2);
        notas.put("João", 7.5);
        notas.put("Pedro", 8.0);

        Map<String, String> turmas = new HashMap<>();
        turmas.put("Ana", "A");
        turmas.put("Carlos", "A");
        turmas.put("Maria", "B");
        turmas.put("João", "B");
        turmas.put("Pedro", "A");

        Map<String, Double> melhorNota = new HashMap<>();
        Map<String, String> alunoMelhorNota = new HashMap<>();

        for (Map.Entry<String, Double> entry: notas.entrySet()) {
            String aluno = entry.getKey();
            Double nota = entry.getValue();
            String turma = turmas.get(aluno);

            if (!melhorNota.containsKey(turma)) {
                melhorNota.put(turma,nota);
                alunoMelhorNota.put(turma,aluno);
            } else if (nota > melhorNota.get(turma)) {
                melhorNota.put(turma,nota);
                alunoMelhorNota.put(turma,aluno);
            }
        }

        for (Map.Entry<String, Double> entry: melhorNota.entrySet()) {
            System.out.println("Turma " + entry.getKey() + " → " + alunoMelhorNota.get(entry.getKey()) + " (" + entry.getValue() + ")");
        }
    }
}
