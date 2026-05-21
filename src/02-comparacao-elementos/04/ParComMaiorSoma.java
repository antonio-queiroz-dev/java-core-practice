package fase02.exe04;

public class ParComMaiorSoma {
    static void main() {

        ParComMaiorSoma parComMaiorSoma = new ParComMaiorSoma();

        Entrada:;
        int[] nums =  {1, 3, 2, 8, 4};
        //Saída: 12 (8 + 4)

        Entrada:;
        int[] nums2 = {5, 1, 5};
        //Saída: 6 (5 + 1 ou 1 + 5)

        int[] nums3 = {10, 20};
        //Saída: 30

        System.out.println(parComMaiorSoma.maiorSomaVizinhos(nums));
        System.out.println(parComMaiorSoma.maiorSomaVizinhos(nums2));
        System.out.println(parComMaiorSoma.maiorSomaVizinhos(nums3));

    }

    public int maiorSomaVizinhos(int[] nums) {

        int soma = 0;
        int maiorSoma = 0;

        for (int i = 0; i < nums.length -1; i++) {
            soma = nums[i] + nums[i + 1];
            if (soma > maiorSoma) {
                maiorSoma = soma;
            }
        }
        return maiorSoma;
    }
}
