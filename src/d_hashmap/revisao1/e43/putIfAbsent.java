package d_hashmap.revisao1.e43;

import java.util.HashMap;
import java.util.Map;

public class putIfAbsent {
    // O cliente clientes[i] fez uma compra de valores[i]. Registre apenas a primeira compra de cada cliente (ignore as seguintes). Use putIfAbsent.

    static void main() {
        String[] clientes = {"Ana", "Bruno", "Ana", "Carla", "Bruno", "Ana"};
        int[] valores = {50, 80, 120, 200, 30, 90};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clientes.length; i++) {
            map.putIfAbsent(clientes[i],valores[i]);
        }

        System.out.println(map);
    }
}
