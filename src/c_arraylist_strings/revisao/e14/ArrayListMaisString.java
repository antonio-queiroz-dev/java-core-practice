package c_arraylist_strings.revisao.e14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaisString {
    // Um sistema recebeu uma lista de e-mails de cadastro: {"junior@gmail.com", "ana@hotmail.com", "carlos@gmail.com",
    // "bruna@yahoo.com", "pedro@gmail.com", "maria@hotmail.com"}. Separe os e-mails em dois ArrayLists:
    // um com os que são @gmail.com e outro com o resto. Imprima as duas listas.

    static void main() {
        List<String> lista = List.of("junior@gmail.com","ana@hotmail.com", "carlos@gmail.com",
        "bruna@yahoo.com", "pedro@gmail.com", "maria@hotmail.com");

        List<String> gMail = new ArrayList<>();
        List<String> outros = new ArrayList<>();

        for (String l: lista) {
            if (l.endsWith("@gmail.com")) {
                gMail.add(l);
            } else {
                outros.add(l);
            }
        }

        System.out.println("Gmail: " + gMail);
        System.out.println("Outros: " + outros);
    }

}
