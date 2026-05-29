package b_comparacao_elementos.revisao.e02;

public class ParesDeElementosQueSomamUmValor {
    static void main() {
        int[] numeros = {2, 8, 3, 7, 4, 6, 1, 9};

        for (int i = 0; i < numeros.length ; i++) {
            for (int j = i +1 ; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == 10) {
                    System.out.println(numeros[i] + " + " + numeros[j] + " = 10");
                }
            }
        }
    }
}
