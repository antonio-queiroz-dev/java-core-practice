package a_for_acumulador.revisao.e07;

public class DiferencaEntreMaiorEMenor {
    // Dado um array, encontre o maior e o menor valor e calcule a diferença entre eles.
    static void main() {
        int[] numeros = {14, 3, 27, 8, 45, 2, 19};
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int diferenca = 0;

        for (int n: numeros) {
            if (n > maior) maior = n;
            if (n < menor) menor = n;
        }

        diferenca = maior - menor;
        System.out.println("Maior: " + maior + " | Menor: " + menor + " | Diferença: " + diferenca);

    }
}
