package c_arraylist_strings.revisao.e15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaisString {
    // Um sistema recebeu mensagens de log:
    // {"INFO: servidor iniciado", "ERROR: conexão recusada", "INFO: requisição recebida", "ERROR: timeout", "INFO: resposta enviada", "ERROR: disco cheio"}.
    // Separe as mensagens em dois ArrayLists (INFO e ERROR). Depois, imprima só a parte depois dos dois pontos de cada mensagem de ERROR.

    static void main() {
        List<String> logs = List.of("INFO: servidor iniciado","ERROR: conexão recusada", "INFO: requisição recebida", "ERROR: timeout", "INFO: resposta enviada", "ERROR: disco cheio");


        List<String> erros = new ArrayList<>();
        List<String> infos = new ArrayList<>();

        for (String l: logs) {
            if (l.startsWith("ERROR")) {
                erros.add(l.split(": ")[1]);
            } else if (l.startsWith("INFO")) {
                infos.add(l.split(": ")[1]);
            }
        }

        System.out.println("Erros "+ erros);
        System.out.println("Infos "+ infos);
    }
}
