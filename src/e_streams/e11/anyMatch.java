package e_streams.e11;

import java.util.List;

public class anyMatch {
    // Dada uma lista de notas, verifique se algum aluno tirou nota 10.

    static void main() {
        List<Double> notas = List.of(7.5, 8.0, 9.2, 6.5, 10.0, 4.3);
        boolean nota10 = notas.stream().anyMatch(n -> n == 10);
        System.out.println(nota10);
    }
}
