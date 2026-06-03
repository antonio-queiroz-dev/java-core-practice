package c_arraylist_strings.revisao.e04;

import java.util.ArrayList;
import java.util.List;

public class RemoverPalavrasCurtas {
    // Dada uma frase, crie uma nova frase contendo apenas as palavras com 3 ou mais letras.
    public static void main(String[] args) {
        String frase = "eu vi o sol e a lua no céu de SP";
        String[] palavras = frase.split(" ");
        List<String> novaFrase = new ArrayList<>();

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() >= 3 ) {
                novaFrase.add(palavras[i]);
            }
        }

        System.out.println(novaFrase);
    }
}
