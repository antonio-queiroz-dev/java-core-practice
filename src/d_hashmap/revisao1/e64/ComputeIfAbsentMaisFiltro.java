package d_hashmap.revisao1.e64;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentMaisFiltro {
    // Uma biblioteca registrou os livros emprestados por aluno:
    // {"Ana"-"Java", "Carlos"-"Python", "Ana"-"SQL", "Carlos"-"Java", "Maria"-"C++", "Ana"-"Spring", "Carlos"-"SQL", "Maria"-"Java"}.
    // Agrupe os livros por aluno numa List (usando computeIfAbsent). Depois, filtre e imprima apenas os alunos que pegaram 3 ou mais livros.

    static void main() {
        List<String> nomes = List.of(
                "Ana", "Carlos", "Ana", "Carlos", "Maria", "Ana", "Carlos", "Maria");

        List<String> tecnologias = List.of(
                "Java", "Python", "SQL", "Java", "C++", "Spring", "SQL", "Java");
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < nomes.size(); i++) {
            map.computeIfAbsent(nomes.get(i), k -> new ArrayList<>()).add(tecnologias.get(i));
        }

        List<String> maisDe3 = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 3) {
                maisDe3.add(entry.getKey());
            }
        }

        System.out.println(map);
        System.out.println("3+ livros: " + maisDe3);
    }
}
