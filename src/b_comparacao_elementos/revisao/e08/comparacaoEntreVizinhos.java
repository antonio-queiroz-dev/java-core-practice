package b_comparacao_elementos.revisao.e08;

public class comparacaoEntreVizinhos {
    // Conte quantas vezes a temperatura subiu em relação ao dia anterior. Imprima só o número.

    static void main() {
        int[] temperaturas = {20, 22, 19, 25, 25, 30, 28};
        int subidas = 0;

        for (int i = 0; i < temperaturas.length - 1; i++) {
            if (temperaturas[i] < temperaturas[i + 1]) subidas += 1;
        }
        System.out.println(subidas);
    }
}
