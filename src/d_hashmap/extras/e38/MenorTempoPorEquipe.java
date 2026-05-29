package d_hashmap.extras.e38;

import java.util.HashMap;
import java.util.Map;

public class MenorTempoPorEquipe {
    static void main() {

        Map<String, Double> tempos = new HashMap<>();
        tempos.put("Ana", 12.5);
        tempos.put("Carlos", 15.0);
        tempos.put("Maria", 11.8);
        tempos.put("João", 13.2);
        tempos.put("Pedro", 14.0);

        Map<String, String> equipes = new HashMap<>();
        equipes.put("Ana", "Azul");
        equipes.put("Carlos", "Azul");
        equipes.put("Maria", "Vermelho");
        equipes.put("João", "Vermelho");
        equipes.put("Pedro", "Azul");

        Map<String, Double> menorTempo = new HashMap<>();
        Map<String, String> corredorMenorTempo = new HashMap<>();

        for (Map.Entry<String, Double> entry: tempos.entrySet()) {
            String corredor = entry.getKey();
            double tempo = entry.getValue();
            String equipe = equipes.get(corredor);

            if (!menorTempo.containsKey(equipe)) {
                menorTempo.put(equipe, tempo);
                corredorMenorTempo.put(equipe, corredor);
            } else if (tempo < menorTempo.get(equipe)) {
                menorTempo.put(equipe, tempo);
                corredorMenorTempo.put(equipe, corredor);
            }
        }

        for (Map.Entry<String, Double> entry: menorTempo.entrySet()) {
            System.out.println(entry.getKey() + " → " + corredorMenorTempo.get(entry.getKey()) + " (" + entry.getValue() + ")");
        }
    }
}
