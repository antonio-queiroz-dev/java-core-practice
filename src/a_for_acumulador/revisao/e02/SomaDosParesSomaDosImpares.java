package a_for_acumulador.revisao.e02;

public class SomaDosParesSomaDosImpares {
    static void main() {

        int[] numeros = {3, 8, 12, 5, 7, 20, 1, 4};

        int somaPar = 0;
        int somaImpar = 0;

        for (int n: numeros) {
            if (n % 2 == 0) {
                somaPar += n;
            } else {
                somaImpar += n;
            }
        }

        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos impares: " +somaImpar);
    }
}
