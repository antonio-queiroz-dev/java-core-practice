package d_hashmap.revisao1.e09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupamentoComList {
    // Agrupe as palavras por tamanho (quantidade de letras):
    public static void main(String[] args) {
        String frase = "sol lua mar rio ave céu";
        String[] palavra = frase.split(" ");
        Map<Integer, List<String>> tamanho = new HashMap<>();

        for (int i = 0; i < palavra.length ; i++) {
            if (tamanho.containsKey(palavra[i].length())) {
                tamanho.get(palavra[i].length()).add(palavra[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(palavra[i]);
                tamanho.put(palavra[i].length(),list);
            }
        }


        System.out.println(tamanho);
    }
}
