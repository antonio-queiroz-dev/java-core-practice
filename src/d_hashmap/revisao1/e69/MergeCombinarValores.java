package d_hashmap.revisao1.e69;

import java.util.HashMap;
import java.util.Map;

public class MergeCombinarValores {
    //Dois turnos de uma loja registraram o faturamento por categoria:
    //
    //Manhã: {"Roupas"=350.0, "Calçados"=200.0, "Acessórios"=90.0}
    //Tarde: {"Calçados"=280.0, "Acessórios"=110.0, "Eletrônicos"=500.0}

    static void main() {
        Map<String, Double> manha = Map.of("Roupas",350.0, "Calçados",200.0, "Acessórios",90.0);
        Map<String, Double> tarde = Map.of("Calçados",280.0, "Acessórios",110.0, "Eletrônicos",500.0);

        Map<String, Double> map = new HashMap<>();

        for (Map.Entry<String,Double> entry: manha.entrySet()) {
            map.merge(entry.getKey(),entry.getValue(), Double::sum);
        }
        for (Map.Entry<String,Double> entry: tarde.entrySet()) {
            map.merge(entry.getKey(),entry.getValue(), Double::sum);
        }

        System.out.println(map);
    }
}
