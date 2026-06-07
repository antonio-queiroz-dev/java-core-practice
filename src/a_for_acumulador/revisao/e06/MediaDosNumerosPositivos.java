package a_for_acumulador.revisao.e06;

public class MediaDosNumerosPositivos {
    // Dado um array, calcule a média apenas dos números positivos (ignore negativos e zeros).
    static void main() {
        int[] numeros = {-3, 5, 0, 8, -1, 12, 0, 3, -7};
        int contPositivos = 0;
        int somaPositivos = 0;

        for (int n: numeros) {
            if (n > 0 ){
                contPositivos +=1;
                somaPositivos += n;
            }
        }

        double media = (double) somaPositivos / contPositivos;
        System.out.println("Média dos positivos: " + media);

    }
}
