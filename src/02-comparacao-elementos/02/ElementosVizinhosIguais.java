package fase02.exe02;

public class ElementosVizinhosIguais {
    public static void main(String[] args) {
        ElementosVizinhosIguais elementosVizinhosIguais = new ElementosVizinhosIguais();

        int[] nums = {1, 2, 3, 3, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {1, 2, 1, 2, 1};
        int[] nums4 = {5,5};

        System.out.println(elementosVizinhosIguais.temVizinhosIguais(nums));
        System.out.println(elementosVizinhosIguais.temVizinhosIguais(nums2));
        System.out.println(elementosVizinhosIguais.temVizinhosIguais(nums3));
        System.out.println(elementosVizinhosIguais.temVizinhosIguais(nums4));

    }

    public boolean temVizinhosIguais(int[] nums) {
        for (int i = 0; i < nums.length -1; i++) {
         if (nums[i] == nums[i +1]){
             return true;
         }
        }
        return false;
    }
}
