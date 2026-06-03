package d_hashmap.revisao1.e11;

import java.util.HashMap;
import java.util.Map;

public class ExercicioLivre {
    //Dado um registro de compras, descubra: quanto cada cliente gastou no total,
    // e qual cliente gastou mais.
    public static void main(String[] args) {
        String[] clientes = {"Ana", "Carlos", "Ana", "Maria", "Carlos", "Ana", "Maria"};
        double[] valores = {50.0, 120.0, 30.0, 200.0, 80.0, 45.0, 150.0};

        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < clientes.length; i++) {
            map.merge(clientes[i],valores[i],(antigo, novo) -> antigo + novo);
        }

        double maiorGasto = Integer.MIN_VALUE;
        String maiorGastador = "";

        for (Map.Entry<String, Double> entry: map.entrySet()) {
            if (entry.getValue() > maiorGasto) {
                maiorGastador = entry.getKey();
                maiorGasto = entry.getValue();
            }
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("Cliente que mais gastou: " + maiorGastador + " (R$" + maiorGasto + ")");
    }
}
