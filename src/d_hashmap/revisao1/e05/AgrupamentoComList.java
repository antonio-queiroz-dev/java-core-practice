package d_hashmap.revisao1.e05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoComList {
    static void main() {
        int[] numeros = {5, -3, 8, -1, 0, -7, 4, 2, -9};
        String nome = "";
        Map<String, List<Integer>> map = new HashMap<>();


        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero > 0) {
                nome = "Positivo";
            } else if (numero == 0) {
                nome = "Zero";
            } else nome = "Negativo";

            if (map.containsKey(nome)){
                map.get(nome).add(numero);
            } else {
                List<Integer> numerosList = new ArrayList<>();
                numerosList.add(numero);
                map.put(nome,numerosList);
            }
        }

        System.out.println(map);
        }
    }
