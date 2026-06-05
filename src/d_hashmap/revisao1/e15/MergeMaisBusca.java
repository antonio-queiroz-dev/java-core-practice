package d_hashmap.revisao1.e15;

import java.util.HashMap;
import java.util.Map;

public class MergeMaisBusca {
    // Dado um registro de horas trabalhadas, some o total por funcionário e encontre quem trabalhou mais.

    static void main() {
        String[] funcionarios = {"Ana", "Carlos", "Ana", "Carlos", "Maria", "Ana", "Maria"};
        int[] horas = {8, 6, 7, 9, 8, 5, 7};

        Map<String, Integer> horasTrabalhadas = new HashMap<>();

        for (int i = 0; i < funcionarios.length; i++) {
            horasTrabalhadas.merge(funcionarios[i], horas[i],(antigo, novo) -> antigo + novo );
        }

        String funcMaisTrabalhou = "";
        int maisTrabalhouHora = 0;

        for (Map.Entry<String, Integer> entry: horasTrabalhadas.entrySet()) {

            if (entry.getValue() > maisTrabalhouHora) {
                funcMaisTrabalhou = entry.getKey();
                maisTrabalhouHora = entry.getValue();
            }

            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        System.out.println("Mais trabalhou: " + funcMaisTrabalhou + " (" + maisTrabalhouHora + "h)");
    }
}
