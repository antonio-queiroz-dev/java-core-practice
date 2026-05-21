package fase04.exe08;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static void main() {
        TwoSum twoSum = new TwoSum();

        int[] a = {2, 7, 11, 15};
        System.out.println("Esperado: [0, 1]\nSaida:    " + Arrays.toString(twoSum.doisSomam(a, 9)) + "\n");

        int[] b = {3, 2, 4};
        System.out.println("Esperado: [1, 2]\nSaida:    " + Arrays.toString(twoSum.doisSomam(b, 6)) + "\n");

        int[] c = {3, 3};
        System.out.println("Esperado: [0, 1]\nSaida:    " + Arrays.toString(twoSum.doisSomam(c, 6)) + "\n");
    }

    public int[] doisSomam(int[] nums, int alvo) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] numsa = {1,2,3};

        for (int i = 0; i < nums.length; i++) {
            int complemento = alvo - nums[i];

            if (map.containsKey(complemento)){
                map.put(complemento,map.get(nums[i]));
            } else map.put(complemento,1);

        }
        return numsa ;
        






    }
}
