package fase04.exe04;

import java.util.HashMap;

public class PrimeiroUnico {
    static void main() {

        PrimeiroUnico primeiroUnico = new PrimeiroUnico();

        int[] a = {2, 3, 4, 2, 3};
        System.out.println("Esperado 4\nSaida:  "+ primeiroUnico.primeiroUnico(a) + "\n");

        int[] b = {1, 1, 2, 2, 3};
        System.out.println("Esperado 3\nSaida:  "+ primeiroUnico.primeiroUnico(b) + "\n");

        int[] c = {5, 5, 5};
        System.out.println("Esperado -1\nSaida:  "+ primeiroUnico.primeiroUnico(c) + "\n");

    }
    public int primeiroUnico(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num: nums) {
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else map.put(num,1);
        }

        for (int num: nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
