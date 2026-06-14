package d_hashmap.revisao1.e30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoMaisMaior {
    //Agrupe as frutas por cor e diga qual cor tem mais frutas:
    static void main() {
        Map<String, String> frutas = new HashMap<>();
        frutas.put("Banana", "Amarelo");
        frutas.put("Maçã", "Vermelho");
        frutas.put("Morango", "Vermelho");
        frutas.put("Limão", "Amarelo");
        frutas.put("Uva", "Roxo");
        frutas.put("Manga", "Amarelo");

        Map<String, List<String>> cores = new HashMap<>();

        for (Map.Entry<String, String> entry : frutas.entrySet()) {
            cores.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        String maiorCor = "";
        int maiorQtd = 0;
        for (Map.Entry<String, List<String>> entry : cores.entrySet()) {
            if (entry.getValue().size() > maiorQtd) {
                maiorQtd = entry.getValue().size();
                maiorCor = entry.getKey();
            }
            System.out.println(entry.getKey() + " → " + entry.getValue() + " (" + entry.getValue().size() + ")");
        }
        System.out.println("Cor com mais frutas: " + maiorCor + " (" + maiorQtd + ")");
    }
}
