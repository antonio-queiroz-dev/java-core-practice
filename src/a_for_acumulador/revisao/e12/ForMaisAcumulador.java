package a_for_acumulador.revisao.e12;

public class ForMaisAcumulador {
    // Calcule a soma e a média das notas. Imprima os dois.
    static void main() {
        int[] notas = {7, 4, 9, 6, 8, 5, 10, 3};
        int soma = 0;
        double media = 0;
        int quantNotas = notas.length;

        for (int n: notas) {
            soma += n;
        }

        media = (double) soma / quantNotas;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
