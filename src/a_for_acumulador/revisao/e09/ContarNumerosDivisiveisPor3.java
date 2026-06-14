package a_for_acumulador.revisao.e09;

public class ContarNumerosDivisiveisPor3 {
    // Contar quantos números são divisíveis por 3
    static void main() {
        int[] numeros = {9, 4, 15, 7, 12, 3, 8, 21, 5};
        int quantNumeros = 0;

        for (int n: numeros) {
            if (n% 3 == 0) {
                quantNumeros += 1;
            }
        }

        System.out.println("Quantidade de números divisíveis por 3: " + quantNumeros);
    }
}
