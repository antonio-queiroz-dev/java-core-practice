package fase01.exe01;

import java.util.Arrays;
import java.util.OptionalInt;

public class encontrarMaiorNumero {
    public static void main(String[] args) {
        int[] nums = {-3,2,3,5,6,8,9};
        int maior = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maior){
                maior = nums[i];
            }
        }
        System.out.println(maior);

        OptionalInt max = Arrays.stream(nums).max();
        System.out.println(max.getAsInt());

    }
}

