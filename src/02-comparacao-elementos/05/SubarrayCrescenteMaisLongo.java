package fase02.exe05;

public class SubarrayCrescenteMaisLongo {

    static void main() {
        SubarrayCrescenteMaisLongo subarrayCrescenteMaisLongo = new SubarrayCrescenteMaisLongo();

        int[] nums = {1, 2, 3, 1, 2};

        // Saída: 3 (a sequência 1, 2, 3)

        int[] nums2 = {5, 4, 3, 2, 1};

        // Saída: 1 (nenhum par crescente, cada elemento sozinho)

        int[] nums3 = {1, 2, 1, 2, 3, 4};

        //Saída: 4 (a sequência 1, 2, 3, 4 no final)

        int[] nums4 = {10};

        // Saída: 1

        System.out.println("saida esperada: 3 saida recebida :" + subarrayCrescenteMaisLongo.maiorSequenciaCrescente(nums));
        System.out.println("saida esperada: 1 saida recebida :" + subarrayCrescenteMaisLongo.maiorSequenciaCrescente(nums2));
        System.out.println("saida esperada: 4 saida recebida :" + subarrayCrescenteMaisLongo.maiorSequenciaCrescente(nums3));
        System.out.println("saida esperada: 1 saida recebida :" + subarrayCrescenteMaisLongo.maiorSequenciaCrescente(nums4));




    }

    public int maiorSequenciaCrescente(int[] nums) {
        int sequenciaAtual = 1;
        int maiorSequencia = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]){
                sequenciaAtual += 1;
        } else {
                sequenciaAtual =1;
            }
            if (maiorSequencia < sequenciaAtual) {
            maiorSequencia = sequenciaAtual;
            }
        }
        return maiorSequencia;
    }
}
