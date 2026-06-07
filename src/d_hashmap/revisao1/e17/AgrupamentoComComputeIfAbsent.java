package d_hashmap.revisao1.e17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoComComputeIfAbsent {
    //    Agrupe os números em "Par" e "Ímpar" usando computeIfAbsent:
    static void main() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        String tipo = "";

        Map<String, List<Integer>> parImpar = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                tipo = "Par";
            } else {
                tipo = "Impar";
            }
            parImpar.computeIfAbsent(tipo, k -> new ArrayList<>()).add(numeros[i]);
        }

        System.out.println(parImpar);
    }
}
