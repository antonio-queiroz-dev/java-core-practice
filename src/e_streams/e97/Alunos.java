package e_streams.e97;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Alunos {
    // Descubra quantos alunos existem em cada curso.

    static void main() {
        record Aluno(String nome, String curso, double nota) {}

        List<Aluno> alunos = List.of(
                new Aluno("Ana", "TI", 8.5),
                new Aluno("Bruno", "Direito", 7.0),
                new Aluno("Carla", "TI", 9.2),
                new Aluno("Diego", "Medicina", 6.8),
                new Aluno("Eduarda", "TI", 7.9),
                new Aluno("Felipe", "Direito", 8.1)
        );

        Map<String, Long> resultado = alunos.stream()
                .collect(Collectors.groupingBy(
                        n-> n.curso(),
                        Collectors.counting()
                ));

        System.out.println(resultado);

    }
}
