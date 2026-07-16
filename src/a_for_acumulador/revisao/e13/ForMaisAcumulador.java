package a_for_acumulador.revisao.e13;

public class ForMaisAcumulador {
    // Encontre o maior e o menor tempo. Imprima os dois.

    static void main() {
        int[] tempos = {12, 5, 8, 15, 3, 9, 20};

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int t: tempos) {
            if (t > maior) maior = t;
            if (t < menor) menor = t;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
