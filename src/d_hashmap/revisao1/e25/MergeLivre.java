package d_hashmap.revisao1.e25;

import java.util.HashMap;
import java.util.Map;

public class MergeLivre {
    // Duas turmas fizeram uma prova. Junte as notas somando quando o aluno aparece nas duas:

    static void main() {
        Map<String, Double> turmaA = new HashMap<>();
        turmaA.put("Ana", 8.0);
        turmaA.put("Carlos", 7.5);
        turmaA.put("Maria", 9.0);

        Map<String, Double> turmaB = new HashMap<>();
        turmaB.put("Carlos", 8.0);
        turmaB.put("Maria", 7.0);
        turmaB.put("João", 6.5);

        Map<String, Double> notasSomadas = new HashMap<>();

        for (Map.Entry<String, Double> entry: turmaA.entrySet()) {
            notasSomadas.merge(entry.getKey(), entry.getValue(),(antigo, novo) -> antigo + novo);
        }
        for (Map.Entry<String, Double> entry: turmaB.entrySet()) {
            notasSomadas.merge(entry.getKey(), entry.getValue(),(antigo, novo) -> antigo + novo);
        }


        System.out.println(notasSomadas);
    }
}
