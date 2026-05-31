package d_hashmap.extras.e43;

import java.util.HashMap;
import java.util.Map;

//Dado um Map de alunos e notas, gere um relatório com: a média da turma,
// o aluno com maior nota, e quantos alunos ficaram acima da média.

public class RelatorioDeTurma {
    static void main() {

        Map<String, Double> notas = new HashMap<>();
        notas.put("Ana", 8.5);
        notas.put("Carlos", 5.0);
        notas.put("Maria", 9.2);
        notas.put("João", 6.5);
        notas.put("Pedro", 7.0);
        notas.put("Lucas", 4.3);

        String melhorAluno = "";
        double melhorNota = 0.0;
        double notaMedia = 0.0;

        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            if (entry.getValue() > melhorNota) {
                melhorNota = entry.getValue();
                melhorAluno = entry.getKey();
            }
            notaMedia += entry.getValue();
        }

        notaMedia = notaMedia / notas.size();

        int quantAcimaMedia = 0;
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            if (entry.getValue() >= notaMedia) {
                quantAcimaMedia +=1;
            }
        }

        System.out.println("Média da turma: " + notaMedia);
        System.out.println("Maior nota: " + melhorAluno + " (" + melhorNota + ")");
        System.out.println("Acima da média: " + quantAcimaMedia + "alunos");

    }
}
