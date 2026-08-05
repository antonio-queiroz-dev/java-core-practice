package d_hashmap.revisao1.e57;

import java.util.HashMap;
import java.util.Map;

public class Merge {
    //Um vendedor registrou suas vendas em duas semanas separadas:
    //
    //Semana 1: {"Arroz"=120.0, "Feijão"=85.0, "Macarrão"=60.0}
    //Semana 2: {"Feijão"=90.0, "Macarrão"=45.0, "Leite"=70.0}
    //
    //Combine os dois mapas num só, somando os valores dos produtos que aparecem nos dois. Use merge.

    static void main() {
        Map<String, Double> semana1 = Map.of("Arroz", 120.0, "Feijão", 85.0, "Macarrão" , 60.0);
        Map<String, Double> semana2 = Map.of("Feijão",90.0, "Macarrão",45.0, "Leite",70.0);

        Map<String, Double> cominado = new HashMap<>();

        for (Map.Entry<String,Double> entry: semana1.entrySet()) {
            cominado.merge(entry.getKey(), entry.getValue(), (antigo, novo) -> antigo + novo);
        }
        for (Map.Entry<String,Double> entry: semana2.entrySet()) {
            cominado.merge(entry.getKey(), entry.getValue(), (antigo, novo) -> antigo + novo);
        }

        System.out.println(cominado);

    }
}
