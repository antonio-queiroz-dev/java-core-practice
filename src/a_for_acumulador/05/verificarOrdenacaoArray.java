package fase01.exe05;

public class verificarOrdenacaoArray {
    public static void main(String[] args) {
        verificarOrdenacaoArray verificarOrdenacaoArray = new verificarOrdenacaoArray();
        int[] nums = {1,2,3};
        System.out.println(verificarOrdenacaoArray.estaOrdenado(nums));
        int[] nums2 = {1,2,3,1};
        System.out.println(verificarOrdenacaoArray.estaOrdenado(nums2));
        int[] nums3 = {1,2,3,5};
        System.out.println(verificarOrdenacaoArray.estaOrdenado(nums3));

    }

    public boolean estaOrdenado(int[] nums) {
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;

    }
}
