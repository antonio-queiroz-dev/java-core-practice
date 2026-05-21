package fase04.exe01;

import java.util.HashMap;

public class ContarFrequenciaNumeros {
    public static void main(String[] args) {

        ContarFrequenciaNumeros contarFrequenciaNumeros = new ContarFrequenciaNumeros();

        int[] a =  {1, 2, 2, 3, 3, 3};
        System.out.printf("Esperado: {1=1, 2=2, 3=3} \nsaida:    " + contarFrequenciaNumeros.contarFrequencia(a) + "\n");

        int[] b =  {5, 5, 5};
        System.out.printf("Esperado: {5=3} \nsaida   : " + contarFrequenciaNumeros.contarFrequencia(b) + "\n");

        int[] c =  {1, 2, 3};
        System.out.printf("Esperado: {1=1, 2=1, 3=1} \nsaida   : " + contarFrequenciaNumeros.contarFrequencia(c) + "\n");

    }
    public HashMap<Integer, Integer> contarFrequencia(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        return map;
    }
}
