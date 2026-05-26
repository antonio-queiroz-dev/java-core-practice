package b_comparacao_elementos.revisao.e01;

public class MaiorDiferençaEntreVizinhos {
    static void main() {

        int[] numeros = {3, 8, 1, 15, 4, 10};

        int maiorDiferenca = 0;
        int numero1 = 0;
        int numero2 = 0;

        for (int i = 0; i < numeros.length -1; i++) {
            if (Math.abs(numeros[i] - numeros[i+1]) > maiorDiferenca) {
                maiorDiferenca = Math.abs(numeros[i] - numeros[i+1]);
                numero1 = numeros[i];
                numero2 = numeros[i+1];
            }
        }

        System.out.println("Maior diferença: " +maiorDiferenca+ " (entre " + numero1 + " e " + numero2 + ")" );
    }
}
