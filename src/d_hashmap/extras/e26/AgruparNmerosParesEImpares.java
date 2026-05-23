package d_hashmap.extras.e26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AgruparNmerosParesEImpares {
    static void main() {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        HashMap<String, List<Integer>> numberslist = new HashMap<>();

        for (Integer n : numeros) {
            String tipo;
            if (n % 2 == 0) {
                tipo = "Par";
            } else tipo = "Impar";

            if (numberslist.containsKey(tipo)){
                numberslist.get(tipo).add(n);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(n);
                numberslist.put(tipo, list);
            }
        }

        System.out.println(numberslist);

    }
}
