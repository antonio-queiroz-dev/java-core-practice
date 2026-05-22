package hashmapExtras.h6;

import java.util.HashMap;

public class PrimeiroProdutoDuplicado {
    static void main() {

        String[] caminhao = {"Arroz", "Feijão", "Café", "Feijão", "Arroz", "Leite"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String c: caminhao){
            if (map.containsKey(c)){
                System.out.println("Primeiro duplicado: " + c);
                break;
            } else map.put(c,1);
        }
    }


}
