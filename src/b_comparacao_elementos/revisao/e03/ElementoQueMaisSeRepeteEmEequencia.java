package b_comparacao_elementos.revisao.e03;

public class ElementoQueMaisSeRepeteEmEequencia {
    //Dado um array, encontre qual número aparece mais vezes seguidas (em sequência).

    static void main() {
        int[] numeros = {1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 5};
        int numeroSequencia = 0;
        int sequenciaAtual = 1;
        int maiorSequencia = 0;

        for (int i = 0; i < numeros.length -1; i++) {
            if (numeros[i] == numeros[i+1]){
                sequenciaAtual +=1;
            } else {
                sequenciaAtual = 1;
            };
            if ( sequenciaAtual > maiorSequencia) {
                numeroSequencia = numeros[i];
                maiorSequencia = sequenciaAtual;
            }
        }

        System.out.println("Maior sequência: " + numeroSequencia + " (" + maiorSequencia + " vezes seguidas)");
    }
}
