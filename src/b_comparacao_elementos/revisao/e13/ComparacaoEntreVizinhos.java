package b_comparacao_elementos.revisao.e13;

public class ComparacaoEntreVizinhos {
    // Uma loja registrou as temperaturas do freezer a cada hora: {-18, -15, -15, -20, -22, -22, -19}.
    // Encontre a maior sequência consecutiva de temperaturas iguais e imprima o valor e quantas vezes seguidas apareceu.

    static void main() {
        int[] temperaturas = {-18, -15, -15, -20, -22, -22, -19};
        int sequencia = 1;
        int maiorSequencia = 1;
        int nMaisRepetido = 0;

        for (int i = 0; i < temperaturas.length -1; i++) {
            if (temperaturas[i] == temperaturas[i + 1]) {
                sequencia++;
            } else {sequencia = 1;
        }
            if (sequencia > maiorSequencia) {
                maiorSequencia = sequencia;
                nMaisRepetido = temperaturas[i];
            }
        }

        System.out.println("Temperatura " + nMaisRepetido + " apareceu " + maiorSequencia + " vezes seguidas (maior sequência)");
    }
}
