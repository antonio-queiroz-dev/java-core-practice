package b_comparacao_elementos.revisao.e15;

import java.util.List;

public class ComparacaoEntreElementos {
    // Um professor registrou as notas de uma prova: {7.5, 8.0, 4.0, 4.5, 9.0, 3.0, 6.0}.
    // Encontre quantas vezes aconteceu de um aluno tirar nota maior que o aluno seguinte na lista (ou seja, a nota "caiu").

    static void main() {
        List<Double> notas = List.of(7.5, 8.0, 4.0, 4.5, 9.0, 3.0, 6.0);
        int quedas = 0;

        for (int i = 0; i < notas.size() - 1; i++) {
            if (notas.get(i) > notas.get(i+1)) {
                quedas ++;
            }
        }
        System.out.println(quedas);
    }

}
