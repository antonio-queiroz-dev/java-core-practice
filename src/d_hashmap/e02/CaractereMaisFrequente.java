package fase04.exe02;

import java.util.HashMap;
import java.util.Map;

public class CaractereMaisFrequente {
    public static void main(String[] args) {
        CaractereMaisFrequente caractereMaisFrequente = new CaractereMaisFrequente();

        String a =  "abracadabra";
        System.out.println("Esperado: a\nsaida:    " +caractereMaisFrequente.caractereMaisFrequente(a));

        String b =  "java";
        System.out.println("Esperado: a\nsaida:    " +caractereMaisFrequente.caractereMaisFrequente(b));

        String c =  "xxx";
        System.out.println("Esperado: x\nsaida:    " +caractereMaisFrequente.caractereMaisFrequente(c));
    }

    public char caractereMaisFrequente(String texto) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        char maior = ' ';
        int maiorContagem = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                maior = entry.getKey();
            }
        }
        return maior;
    }

}
