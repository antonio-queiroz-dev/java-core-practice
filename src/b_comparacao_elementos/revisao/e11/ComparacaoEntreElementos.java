package b_comparacao_elementos.revisao.e11;

public class ComparacaoEntreElementos {
    // Conte a maior sequência consecutiva de valores iguais. Imprima o número.
    public static void main(String[] args) {
        int[] precos = {10, 12, 12, 15, 9, 9, 9, 20};
        int sequencia = 0;
        int maiorSequencia = 0;

        for (int i = 0; i < precos.length -1; i++) {
            if (precos[i] == precos[i+1]) sequencia +=1;
            if (sequencia > maiorSequencia) maiorSequencia = sequencia;
        }

        System.out.println(maiorSequencia);
    }
}
