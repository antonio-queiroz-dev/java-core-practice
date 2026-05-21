package testando;

public class Test01 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();

        int[] nums = {1,2,3,4,5,8,5,0};
        int[] nums2 = {0,2,-1,4,5,8,5,0};
        int[] nums3 = {1,2,3,4,5,-10,5,0};

        System.out.println(test01.menor(nums));
        System.out.println(test01.menor(nums2));
        System.out.println(test01.menor(nums3));

    }

    public int menor(int[] nums) {
        int menor = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < menor) {
                menor = nums[i];
            }
        }
        return menor;
    }
}
