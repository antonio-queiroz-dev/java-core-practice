package b_comparacao_elementos.revisao.e14;

public class ComparacaoEntreElementos {
    //Um sensor mediu a velocidade de carros passando numa avenida: {60, 72, 55, 88, 91, 45, 78}.
    // Encontre a maior diferença de velocidade entre dois carros consecutivos e imprima quais eram as velocidades.
    public static void main(String[] args) {
        int[] velocidades = {60, 72, 55, 88, 91, 45, 78};
        int maiorDiferenca = 0;
        int vel1 = 0;
        int vel2 = 0;

        for (int i = 0; i < velocidades.length - 1; i++) {
            if (Math.abs(velocidades[i] - velocidades[i + 1]) > maiorDiferenca) {
                maiorDiferenca = Math.abs(velocidades[i] - velocidades[i + 1]);
                vel1 = velocidades[i];
                vel2 = velocidades[i + 1];
            }
        }

        System.out.println("Maior diferença: " + maiorDiferenca + " (entre " + vel1 + "e " + vel2 + " km/h)");
    }
}
