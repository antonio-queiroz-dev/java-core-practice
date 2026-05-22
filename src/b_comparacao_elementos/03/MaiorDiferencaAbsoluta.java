package fase02.exe03;


public class MaiorDiferencaAbsoluta {
    public static void main(String[] args) {

        MaiorDiferencaAbsoluta maiorDiferencaAbsoluta = new MaiorDiferencaAbsoluta();
        int[] nums = {1, 3, 2, 8, 4};

        int[] nums2 = {5, 5, 5};

        int[] nums3 =  {10, 1};

        System.out.println("saida esperada: 6");
        System.out.println(maiorDiferencaAbsoluta.maiorDiferencaVizinhos(nums));

        System.out.println("saida esperada: 0");
        System.out.println(maiorDiferencaAbsoluta.maiorDiferencaVizinhos(nums2));

        System.out.println("saida esperada: 9");
        System.out.println(maiorDiferencaAbsoluta.maiorDiferencaVizinhos(nums3));

    }

    public int maiorDiferencaVizinhos(int[] nums) {
        int diferenca = 0;
        int maiorDiferenca = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            diferenca = Math.abs(nums[i] - nums[i + 1]);
            if (diferenca > maiorDiferenca) {
                maiorDiferenca = diferenca;
            }
        }
        return maiorDiferenca;
    }

}
