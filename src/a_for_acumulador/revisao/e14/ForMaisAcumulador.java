package a_for_acumulador.revisao.e14;

public class ForMaisAcumulador {
    //Conte quantos são maiores de idade (18 ou mais) e quantos são menores. Imprima os dois.

    static void main() {
        int[] idades = {25, 17, 30, 15, 22, 16, 19};

        int maior = 0;
        int menor = 0;

        for(int i: idades) {
            if (i >=18) maior ++;
            if (i <18 ) menor ++;
        }

        System.out.println("Maiores: " + maior);
        System.out.println("Menores: " + menor);
    }
}
