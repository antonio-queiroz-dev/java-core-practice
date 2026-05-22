package hashmapExtras.h12;

import java.util.HashMap;
import java.util.Map;

public class InverterChaveValor {
    static void main() {
        Map<String, String> produtos = new HashMap<>();
        produtos.put("Arroz", "Grãos");
        produtos.put("Café", "Bebidas");
        produtos.put("Açúcar", "Doces");

        HashMap<String, String> map = new HashMap<>();
        for (Map.Entry<String, String> entry: produtos.entrySet()){
            map.put(entry.getValue(), entry.getKey());
        }

        System.out.println(map);
    }
}
