package b_comparacao_elementos.revisao.e17;

public class TemperaturaSubiu {
    // Um posto meteorológico registrou a temperatura máxima de 7 dias seguidos. Descubra em quantos dias a temperatura
    // subiu em relação ao dia anterior e qual foi a maior subida registrada.

    public static void main(String[] args) {
        int[] temperaturas = {22, 25, 24, 24, 28, 27, 30};
        int quantSubiu = 0;
        int maiorSubida = 0;

        for (int i = 0; i < temperaturas.length - 1; i++) {
            if (temperaturas[i] < temperaturas[i+1]) {
                quantSubiu++;
                if ((temperaturas[i+1] - temperaturas[i]) > maiorSubida) {
                    maiorSubida = temperaturas[i+1] - temperaturas[i];
                }
            }
        }

        System.out.println("Dias em que a temperatura subiu: " + quantSubiu);
        System.out.println("Maior subida: " + maiorSubida + " graus");

    }
}
