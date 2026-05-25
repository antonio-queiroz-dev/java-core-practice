package a_for_acumulador.extras.e01;

public class Segundomaiornumero {
    static void main() {

        int[] numeros = {15, 42, 8, 23, 37, 4};

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int n: numeros) {
            if (n > maior) {
                segundoMaior = maior;
                maior = n;
            } else if (n < maior && n > segundoMaior) segundoMaior = n;
        }

        System.out.println(segundoMaior);
    }
}
