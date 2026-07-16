package b_comparacao_elementos.revisao.e10;

public class ComparacaoEntreElementos {
    // Conte a maior sequência consecutiva de valores iguais. Imprima o número.

    static void main() {
        int[] estoque = {100, 95, 95, 80, 80, 80, 60};
        int sequencia = 0;
        int maiorSequencia = 0;

        for (int i = 0; i < estoque.length-1; i++) {
            if (estoque[i] == estoque[i+1]){
                sequencia +=1;
            }
            if (sequencia > maiorSequencia) {
                maiorSequencia = sequencia;
            }
        }

        System.out.println(maiorSequencia);
    }
}
