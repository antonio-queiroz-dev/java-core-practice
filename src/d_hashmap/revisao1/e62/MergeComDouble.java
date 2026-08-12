package d_hashmap.revisao1.e62;

import java.util.HashMap;
import java.util.Map;

public class MergeComDouble {
    //Um restaurante registrou as gorjetas recebidas por garçom em dois turnos:
    //
    //Almoço: {"Lucas"=45.0, "Bruna"=60.0, "Rafael"=30.0}
    //Jantar: {"Bruna"=55.0, "Rafael"=70.0, "Carla"=40.0}
    // Combine num mapa só, somando as gorjetas.

    static void main() {
        Map<String, Double> almoco = Map.of("Lucas" ,45.0, "Bruna",60.0, "Rafael",30.0);
        Map<String, Double> jantar = Map.of("Bruna",55.0, "Rafael",70.0, "Carla",40.0);

        Map<String, Double>  gorjetas = new HashMap<>();

        for (Map.Entry<String, Double> entry: almoco.entrySet()){
            gorjetas.merge(entry.getKey(), entry.getValue(), Double::sum);
        }

        for (Map.Entry<String, Double> entry: jantar.entrySet()){
            gorjetas.merge(entry.getKey(), entry.getValue(), Double::sum);
        }

        System.out.println("Gorjetas: " + gorjetas);



    }
}
