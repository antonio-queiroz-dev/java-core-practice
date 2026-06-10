package a_for_acumulador.revisao.e08;

public class ContarInversoesDeSinal {
    // Dado um array, conte quantas vezes o sinal muda de positivo pra negativo ou de negativo pra positivo (ignore zeros).
    static void main() {
        int[] numeros = {3, -1, 4, -2, -5, 7, 1, -3};
        int inversaoDeSinal = 0;

        for (int i = 0; i < numeros.length-1; i++) {
            if (numeros[i] > 0 && numeros[i+1] < 0) {
                inversaoDeSinal +=1;
            }
            if (numeros[i] < 0 && numeros[i+1] > 0) {
                inversaoDeSinal +=1;
            }
        }
        System.out.println("Inversões de sinal: " + inversaoDeSinal);
    }
}
