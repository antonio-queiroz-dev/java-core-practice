package c_arraylist_strings.revisao.e13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMaisString {
    //Separe com split(" ") e colete todas as palavras que terminam com "ato" numa lista. Imprima a lista.
    static void main() {
        String frase = "o gato e o rato brigaram no pato";
        String[] palavras = frase.split(" ");
        List<String> resultado = new ArrayList<>();

        for (String p: palavras) {
            if (p.endsWith("ato")) resultado.add(p);
        }

        System.out.println(resultado);
    }
}
