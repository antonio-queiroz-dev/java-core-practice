package d_hashmap.revisao1.e23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoMaisMaiorLivre {
    // Dado um Map de jogadores e times, agrupe por time e diga qual time tem mais jogadores.

    static void main() {
        Map<String, String> jogadores = new HashMap<>();
        jogadores.put("Neymar", "Santos");
        jogadores.put("Garrincha", "Botafogo");
        jogadores.put("Raphinha", "Barcelona");
        jogadores.put("Rodrygo", "Real Madrid");
        jogadores.put("Endrick", "Real Madrid");
        jogadores.put("Jairzinho", "Botafogo");
        jogadores.put("Nilton Santos", "Botafogo");
        jogadores.put("Heleno de Freitas", "Botafogo");

        Map<String, List<String>> listaPorTimes = new HashMap<>();

        for (Map.Entry<String, String> entry : jogadores.entrySet()) {
            listaPorTimes.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        int maisJogadores = 0;
        String timeMaisJogadores = "";

        for (Map.Entry<String, List<String>> entry : listaPorTimes.entrySet()) {
            if (entry.getValue().size() > maisJogadores) {
                maisJogadores = entry.getValue().size();
                timeMaisJogadores = entry.getKey();
            }

            System.out.println(entry.getKey() + " → " + entry.getValue() + " (" + entry.getValue().size() + ")");
        }
        System.out.println("Maior elenco: " + timeMaisJogadores + " (" + maisJogadores + ")");
    }
}
