package b_comparacao_elementos.revisao.e12;

public class ComparacaoEntreElementos {

    //Encontre a maior subida de um dia pro outro. Imprima o valor da subida.

    static void main() {
        int[] temperaturas = {30, 28, 25, 27, 32, 35, 33};
        int variacao = 0;
        int maiorSubida = Integer.MIN_VALUE;

        for (int i = 0; i < temperaturas.length -1; i++) {
            variacao = temperaturas[i+1] - temperaturas[i];
            if (variacao > maiorSubida) maiorSubida = variacao;
        }

        System.out.println(maiorSubida);
    }
}
