package d_hashmap.revisao1.e76;

import java.util.HashMap;
import java.util.Map;

public class CapitalPais {
    // Você tem um Map de país para capital. Monte um novo Map invertido, de capital para país, e imprima.

    static void main() {
        Map<String, String> paisCapital = new HashMap<>();
        paisCapital.put("Brasil", "Brasília");
        paisCapital.put("Japão", "Tóquio");
        paisCapital.put("França", "Paris");
        paisCapital.put("Egito", "Cairo");

        Map<String, String> capitalPais = new HashMap<>();
        for (Map.Entry<String, String> entry: paisCapital.entrySet()) {
            capitalPais.put(entry.getValue(),entry.getKey());
        }

        System.out.println(capitalPais);

    }
}
