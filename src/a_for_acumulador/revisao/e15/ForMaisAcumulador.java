package a_for_acumulador.revisao.e15;

public class ForMaisAcumulador {
    // Calcule o total vendido e quantas vendas foram acima de 1000. Imprima os dois.
    static void main() {
        double[] vendas = {1200.50, 850.00, 2100.75, 450.30, 1800.00, 600.25};

        double total = 0;
        int vendasAcimaMil = 0;

        for (double v: vendas) {
            total += v;
            if (v >1000) vendasAcimaMil ++;
        }

        System.out.println("Total: " + total);
        System.out.println("Acima de 1000: " + vendasAcimaMil);
    }
}