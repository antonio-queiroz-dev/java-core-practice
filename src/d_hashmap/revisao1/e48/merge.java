package d_hashmap.revisao1.e48;

import java.util.HashMap;
import java.util.Map;

public class merge {
    // O gasto gastos[i] foi no mês meses[i]. Some o total gasto por mês. Use merge.

    public static void main(String[] args) {
        String[] meses = {"jan", "fev", "jan", "mar", "fev", "jan"};
        double[] gastos = {150.0, 200.0, 80.0, 350.0, 120.0, 90.0};

        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < meses.length; i++) {
            map.merge(meses[i],gastos[i],(antigo, novo) -> antigo + novo);
        }

        System.out.println(map);
    }
}
