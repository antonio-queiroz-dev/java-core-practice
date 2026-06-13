package b_comparacao_elementos.revisao.e06;

public class EncontrarEelementoQueMaisSeRepete {
    //Dado um array, encontre qual número aparece mais vezes (sem usar HashMap).

    static void main() {
        int[] numeros = {3, 1, 3, 2, 1, 3, 2, 1, 1};
        int numero = 0;
        int repeticao = 0;

        for (int i = 0; i < numeros.length; i++) {
            int contagem = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contagem +=1;
                }
            }
            if (contagem > repeticao) {
                repeticao = contagem;
                numero = numeros[i];
            }

        }

        System.out.println("Mais frequente: " + numero + " (" + repeticao + "vezes)");


    }
}
