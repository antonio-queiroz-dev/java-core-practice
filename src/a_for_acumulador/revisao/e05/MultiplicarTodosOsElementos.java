package a_for_acumulador.revisao.e05;

public class MultiplicarTodosOsElementos {
    //Dado um array, calcule o produto (multiplicação) de todos os elementos.
    static void main() {
        int[] numeros = {2, 3, 4, 5};
        int resultado = 1;

        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }

        System.out.println("Produto: " + resultado);
    }
}
