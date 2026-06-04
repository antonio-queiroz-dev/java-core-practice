package b_comparacao_elementos.revisao.e04;

public class QuantosParesDeVizinhosSaoAmbosPares {
    //Dado um array, conte quantos pares de elementos vizinhos são ambos números pares.
    static void main() {
        int[] numeros = {4, 8, 3, 2, 6, 1, 10, 12};
        String saida = "";
        int contagemParesIguais = 0;

        for (int i = 0; i < numeros.length -1; i++) {
            if (numeros[i] % 2 == 0 && numeros[i + 1] % 2 == 0) {
                saida += numeros[i] + "-" + numeros[i + 1] + ", ";
                contagemParesIguais +=1;
            }
        }

        System.out.println("Pares de vizinhos pares: " + contagemParesIguais + " (" + saida + ")");
    }
}
