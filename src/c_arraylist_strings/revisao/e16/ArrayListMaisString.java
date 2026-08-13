package c_arraylist_strings.revisao.e16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaisString {
    //Um sistema recebeu nomes completos de clientes:
    // {"Ana Paula Silva", "Carlos Eduardo Santos", "Maria Clara Oliveira", "João Pedro Lima"}.
    // Extraia só o primeiro nome de cada um e guarde num ArrayList. Depois, imprima a lista ordenada em ordem alfabética.

    static void main() {
        List<String> nomes = List.of("Ana Paula Silva", "Carlos Eduardo Santos", "Maria Clara Oliveira", "João Pedro Lima");
        List<String> primeiroNome = new ArrayList<>();

        for (int i = 0; i < nomes.size(); i++) {
            String firstName = nomes.get(i).split(" ")[0];
            primeiroNome.add(firstName);
        }
        primeiroNome.sort(null);
        System.out.println(primeiroNome);
    }
}
