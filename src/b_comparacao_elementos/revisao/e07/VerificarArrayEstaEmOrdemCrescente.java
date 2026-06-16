package b_comparacao_elementos.revisao.e07;

public class VerificarArrayEstaEmOrdemCrescente {
    // Dado um array, verifique se todos os elementos estão em ordem crescente.

    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 12, 15, 20};
        boolean crescente = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1] ) {
                crescente = false;
                break;
            }
        }

        System.out.println("Está em ordem crescente: " + crescente);

    }
}
