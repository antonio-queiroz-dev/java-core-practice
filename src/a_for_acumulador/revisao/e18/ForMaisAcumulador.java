package a_for_acumulador.revisao.e18;

import java.util.List;

public class ForMaisAcumulador {
    //Um anime tem as notas dos episódios de uma temporada: {8.0, 7.5, 9.0, 6.5, 8.5, 9.5, 7.0, 10.0}.
    // Encontre quantos episódios tiraram nota acima de 8.0 e qual foi a soma das notas desses episódios.

    static void main() {
        List<Double> notas = List.of(8.0, 7.5, 9.0, 6.5, 8.5, 9.5, 7.0, 10.0);
        int acimaDeOito = 0;
        double somaDosEps = 0.0;

        for(double n: notas) {
            if (n> 8.0){
                acimaDeOito+=1;
                somaDosEps +=n;
            }
        }

        System.out.println("Episódios acima de 8.0: " + acimaDeOito);
        System.out.println("Soma das notas: " + somaDosEps);
    }
}
