package a_for_acumulador.revisao.e04;

public class QuantidadeDNumerosNegativosPositivosEZeros {
    //Dado um array, conte quantos são negativos, positivos e zeros.
    public static void main(String[] args) {
        int[] numeros = {-5, 3, 0, -2, 8, 0, -1, 7, 4, 0};
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos +=1;
            } else if (numeros[i] < 0) {
                negativos +=1;
            } else {
                zeros +=1;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }
}
