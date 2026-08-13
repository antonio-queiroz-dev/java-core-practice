package a_for_acumulador.revisao.e17;

public class ForMaisAcumulador {
    //Um estoque tem as quantidades de 7 produtos: {45, 12, 0, 30, 0, 8, 0}.
    // Conte quantos produtos estão zerados e calcule a soma total do estoque (só os que têm quantidade).

    static void main() {
        double[] quantidade = {45, 12, 0, 30, 0, 8, 0};
        int zerados = 0;
        int totalNZerados = 0;

        for (double q: quantidade) {
            if (q == 0) {
                zerados +=1;
            } else {
                totalNZerados +=q;
            }
        }
        System.out.println("Produtos zerados: " + zerados);
        System.out.println("Soma do estoque (com quantidade): " + totalNZerados);
    }
}
