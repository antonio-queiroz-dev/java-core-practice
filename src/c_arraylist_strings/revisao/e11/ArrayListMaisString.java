package c_arraylist_strings.revisao.e11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaisString {
    // Separe com split(" ") e colete numa lista apenas as frutas que começam com "a", em maiúsculas. Imprima a lista.

    static void main() {
        String frase = "banana abacaxi uva abacate amora melancia";
        String[] palavras = frase.split(" ");
        List<String> resultado = new ArrayList<>();

        for (String p: palavras) {
            if (p.charAt(0) == 'a') {
                resultado.add(p.toUpperCase());
            }
        }

        System.out.println(resultado);
    }
}
