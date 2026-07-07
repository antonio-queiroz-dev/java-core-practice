package d_hashmap.revisao1.e44;

import java.util.HashMap;
import java.util.Map;

public class InversaoChaveValor {
    //Crie um novo Map invertido: a capital vira chave e o país vira valor.

    static void main() {
        Map<String, String> capitais = Map.of("Brasil", "Brasília", "Argentina", "Buenos Aires", "Chile", "Santiago");

        Map<String, String> map = new HashMap<>();

        for (Map.Entry<String, String> entry: capitais.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }

        System.out.print(map);
    }
}
