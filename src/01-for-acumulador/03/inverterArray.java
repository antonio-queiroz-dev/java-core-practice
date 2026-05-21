package fase01.exe03;

import java.util.Arrays;

public class inverterArray {
    public static void main(String[] args) {

        inverterArray inverterArray = new inverterArray();

        int[] nums = {1,2,3,4,5,6,7};
        int[] nums2 = {5,4,3,2,1};

        System.out.println(Arrays.toString(inverterArray.inverterArrayM(nums)));
        System.out.println(Arrays.toString(inverterArray.inverterArrayM(nums2)));

    }

    public int[] inverterArrayM(int[] nums) {
        int[] numsR = new int[nums.length];
        int cont = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            numsR[cont] = nums[i];
            cont ++;
        }

        return numsR;
    }
}
