package fase01.exe06;

import java.util.ArrayList;

public class Removerduplicatas {
    public static void main(String[] args) {
        Removerduplicatas removerduplicatas = new Removerduplicatas();

        int[] nums = {1, 2, 3, 2, 3, 1};
        System.out.println(removerduplicatas.removerduplicatas(nums));
        int[] nums2 = {1, 2, 3, 1, 2, 3};
        System.out.println(removerduplicatas.removerduplicatas(nums2));
        int[] nums3 = {1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5};
        System.out.println(removerduplicatas.removerduplicatas(nums3));

    }

    public ArrayList removerduplicatas(int[] nums) {


        ArrayList resultado = new ArrayList<>();

        int[] numsR = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (!resultado.contains(nums[i])) {
                resultado.add(nums[i]);
            }
        }
        return resultado;
    }
}
