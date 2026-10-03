package b_comparacao_elementos.revisao.e16;

import java.util.List;

public class ComparacaoEntreElementos {
    // Um fã registrou as notas que deu pra episódios consecutivos de um anime: {8.0, 9.0, 7.5, 7.5, 6.0, 8.5, 9.0}.
    // Encontre quantas vezes a nota se manteve igual entre um episódio e o seguinte.

    static void main() {
        List<Double> notas = List.of(8.0, 9.0, 7.5, 7.5, 6.0, 8.5, 9.0);
        int repeticao = 0;

        for (int i = 0; i < notas.size() - 1; i++) {
            if (notas.get(i).equals(notas.get(i + 1))) {
                repeticao++;
            }
        }

        System.out.println("A nota se manteve igual " + repeticao + " vez");
    }
}
