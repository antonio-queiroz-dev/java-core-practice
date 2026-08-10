package a_for_acumulador.revisao.e16;

public class ForMaisAcumulador {
    // Uma loja registrou os preços de 8 produtos vendidos no dia: {45.90, 12.50, 78.00, 23.40, 99.90, 5.00, 150.00, 34.70}.
    // Encontre o menor preço, o maior preço e a média de todos.

    static void main() {
        double[] vendidos = {45.90, 12.50, 78.00, 23.40, 99.90, 5.00, 150.00, 34.70};
        int quantidadesVendas = vendidos.length;
        double maior = vendidos[0];
        double menor = vendidos[0];
        double totalVendas = 0;
        double media = 0;

        for (double v: vendidos) {
            if (v > maior) {
                maior = v;
            }
            if (v < menor) {
                menor = v;
            }
            totalVendas += v;
        }
        media = totalVendas / quantidadesVendas;

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.printf("Media: %.3f", media);
    }
}
