package a_for_acumulador.revisao.e03;
//Dado um array, calcule a média e conte quantos estão acima e quantos abaixo.

public class ContarQuantosNumerosEstaoAcimaEAbaixoDaMdia {
    static void main() {
        int[] numeros = {10, 25, 3, 18, 7, 30, 12};
        int total = 0;
        int media = 0;
        int acima = 0;
        int abaixo = 0;

        for (int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }

        media = total / numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media ) {
                acima++;
            } else {
                abaixo++;
            }
        }


        System.out.println("Média: " + media);
        System.out.println("Acima da média: " + acima);
        System.out.println("Abaixo da média: " + abaixo);

    }
}
