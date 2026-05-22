package fase02.exe06;

public class PontoDeVirada {
    static void main() {
        PontoDeVirada pontoDeVirada = new PontoDeVirada();

        int[] nums = {1, 3, 5, 4, 2};
        int[] nums2 = {5, 3, 1, 2, 4};
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] nums4 = {5, 5, 3};

        System.out.println("saida esperada 2, recebida: " + pontoDeVirada.pontoDeVirada(nums));
        System.out.println("saida esperada 2, recebida: " + pontoDeVirada.pontoDeVirada(nums2));
        System.out.println("saida esperada -1, recebida: " + pontoDeVirada.pontoDeVirada(nums3));
        System.out.println("saida esperada -1, recebida: " + pontoDeVirada.pontoDeVirada(nums4));

    }

    public int pontoDeVirada(int[] nums) {
        String direcao = "";
        int inicio = 0;
        int resultado = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                direcao = "decrescente";
                inicio = i + 1;
                break;

            } else if (nums[i] < nums[i + 1]) {
                direcao = "crescente";
                inicio = i + 1;
                break;
            }
        }

        for (int i = inicio; i < nums.length - 1; i++) {
            if (direcao.equals("crescente")) {
                if (nums[i] > nums[i + 1]) {
                    resultado = i;
                    break;
                }
            } else if (direcao.equals("decrescente")) {
                if (nums[i] < nums[i + 1]) {
                    resultado = i;
                    break;
                }
            }

        }
        return resultado;
    }
}

