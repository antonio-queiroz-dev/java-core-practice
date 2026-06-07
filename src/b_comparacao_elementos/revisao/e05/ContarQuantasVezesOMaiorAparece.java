package b_comparacao_elementos.revisao.e05;

public class ContarQuantasVezesOMaiorAparece {
    // Dado um array, encontre o maior valor e conte quantas vezes ele aparece.
    static void main() {
        int[] numeros = {3, 7, 2, 7, 5, 7, 1, 4};
        int maior = Integer.MIN_VALUE;
        int quantidadeRepticaoMaior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maior) {
                quantidadeRepticaoMaior += 1;
            }
        }

        System.out.println("Maior: " + maior + " (aparece " + quantidadeRepticaoMaior + " vezes)");

    }
}
