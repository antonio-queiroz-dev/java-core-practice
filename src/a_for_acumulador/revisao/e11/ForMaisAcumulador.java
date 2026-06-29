package a_for_acumulador.revisao.e11;

public class ForMaisAcumulador {
    // encontre o menor preço. Imprima só o valor.
    static void main() {
        double[] precos = {12.50, 8.90, 45.00, 3.75, 22.30};
        double menor = Integer.MAX_VALUE;

        for (double p: precos) {
            if (p < menor) menor = p;
        }

        System.out.println(menor);
    }
}
