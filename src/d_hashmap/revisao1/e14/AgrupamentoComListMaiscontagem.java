package d_hashmap.revisao1.e14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoComListMaiscontagem {
    //Dado um Map de alunos e cursos, agrupe os alunos por curso e diga qual curso tem mais alunos.
    static void main() {
        Map<String, String> matriculas = new HashMap<>();
        matriculas.put("Ana", "Java");
        matriculas.put("Carlos", "Python");
        matriculas.put("Maria", "Java");
        matriculas.put("João", "Python");
        matriculas.put("Pedro", "Java");
        matriculas.put("Lucas", "JavaScript");

        Map<String, List<String>> listaPorCurso = new HashMap<>();

        for (Map.Entry<String, String> entry : matriculas.entrySet()) {
            listaPorCurso.computeIfAbsent(entry.getValue(), n -> new ArrayList<>()).add(entry.getKey());
        }

        String nomeCursoMaisAlunos = "";
        int cursoMaisAlunos = 0;

        for (Map.Entry<String, List<String>> entry : listaPorCurso.entrySet()) {
            if (entry.getValue().size() > cursoMaisAlunos) {
                nomeCursoMaisAlunos = entry.getKey();
                cursoMaisAlunos = entry.getValue().size();
            }

            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        System.out.println("Curso com mais alunos: " + nomeCursoMaisAlunos + " (" + cursoMaisAlunos + ")");
    }
}
