package d_hashmap.revisao1.e28;

import java.util.HashMap;
import java.util.Map;

public class MergeMaisgetOrDefaultLivre {
    // Dado um array de notas, conte quantas são acima de 7 e quantas são abaixo, usando getOrDefault:

    static void main() {
        double[] notas = {8.5, 5.0, 9.2, 6.5, 7.0, 4.3, 8.0, 3.5};

        Map<String, Integer> map = new HashMap<>();

        for (double n : notas) {
            if (n < 7.0) {
                map.merge("Abaixo", 1, (antigo, novo) -> antigo + novo);
            }
            if (n > 7.0) {
                map.merge("Acima", 1, (antigo, novo) -> antigo + novo);
            }
        }

        System.out.println(map);
        }
    }
