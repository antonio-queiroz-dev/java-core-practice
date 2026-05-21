package fase01.exe04;

public class somaTodosElementos {
    public static void main(String[] args) {
        somaTodosElementos somaTodosElementos = new somaTodosElementos();
        int[] nums = {1,2,3};

        System.out.println(somaTodosElementos.somarArray(nums));
    }

    public int somarArray(int[] nums) {
        int soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma = nums[i] + soma;
        }
        return soma;
    }
}
