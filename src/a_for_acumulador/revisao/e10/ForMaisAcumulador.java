package a_for_acumulador.revisao.e10;

public class ForMaisAcumulador {
    // Percorra com for e descubra quantas vendas foram acima de 100. Imprima só o número final.

    static void main() {
        int[] vendas = {45, 120, 30, 200, 85, 15, 150};
        int acimaDe100 = 0;

        for (int v: vendas) {
            if (v > 100) {
                acimaDe100 +=1;
            }
        }

        System.out.println(acimaDe100);
    }
}
