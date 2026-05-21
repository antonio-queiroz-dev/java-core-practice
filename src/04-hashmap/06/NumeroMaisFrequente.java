package fase04.exe06;

import java.util.HashMap;
import java.util.Map;

public class NumeroMaisFrequente {
    static void main() {

        NumeroMaisFrequente numeroMaisFrequente = new NumeroMaisFrequente();


        int[] a = {1, 2, 2, 3, 3, 3};
        System.out.println("Esperado: 3\nSaida:" + numeroMaisFrequente.numeroMaisFrequente(a) + "\n");

        int[] b = {5, 5, 1, 1, 5};
        System.out.println("Esperado: 5\nSaida:" + numeroMaisFrequente.numeroMaisFrequente(b) + "\n");

        int[] c = {7};
        System.out.println("Esperado: 7\nSaida:" + numeroMaisFrequente.numeroMaisFrequente(c) + "\n");
    }

    public int numeroMaisFrequente(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            } else map.put(num, 1);
        }

        int maior = 0;
        int maiorFrequencia = 0;

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maiorFrequencia) {
                maiorFrequencia = entry.getValue();
                maior = entry.getKey();
            }
        }

        return maior;

    }
}
