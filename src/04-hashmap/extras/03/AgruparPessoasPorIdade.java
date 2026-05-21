package hashmapExtras.h3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparPessoasPorIdade {
    static void main() {

        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 25);
        pessoas.put("Carlos", 30);
        pessoas.put("Maria", 25);
        pessoas.put("João", 30);
        pessoas.put("Pedro", 40);
        pessoas.put("Lucas", 25);

        HashMap<Integer, String> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry: pessoas.entrySet()) {
            if (map.containsKey(entry.getValue())){
                map.put(entry.getValue(),map.get(entry.getValue()) + ", " +entry.getKey());
            } else map.put(entry.getValue(), entry.getKey());
        }

        System.out.print(map);

        HashMap<Integer, List<String>> map1 = new HashMap<>();


        for (Map.Entry<String, Integer> entry: pessoas.entrySet()) {
            if (map1.containsKey(entry.getValue())){
                map1.get(entry.getValue()).add(entry.getKey());
            } else {
                List<String> lista = new ArrayList<>();
                lista.add(entry.getKey());
                map1.put(entry.getValue(), lista);
            }
        }

        System.out.println();
        System.out.println(map1);

    }
}
