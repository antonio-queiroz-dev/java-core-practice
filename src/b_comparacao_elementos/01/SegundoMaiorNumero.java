package fase02.exe01;

import java.util.Arrays;

public class SegundoMaiorNumero {
    public static void main(String[] args) {

        SegundoMaiorNumero segundoMaiorNumero = new SegundoMaiorNumero();

        int[] nums = {1,2,3,4,5,8,7,9};
        int[] nums2 = {1, 9, 9, 3};


        System.out.println(segundoMaiorNumero.segundoMaior(nums));
        System.out.println(segundoMaiorNumero.segundoMaior(nums2));

    }


    public int segundoMaior (int[] nums) {

        int maior = nums[0];
        int segundoMaior = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maior){
                segundoMaior = maior;
                maior = nums[i];
            } else if (nums[i] != maior && nums[i] > segundoMaior) {
                segundoMaior = nums[i];
            }
        }

        return segundoMaior;
    }
}
