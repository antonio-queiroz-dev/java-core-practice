package hashmapExtras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aquecimento {
    static void main() {
        Map<String, List<String>> categorias = new HashMap<>();

// 1) Cria uma lista de grãos
        List<String> graos = new ArrayList<>();
        graos.add("Arroz");
        graos.add("Feijão");

// 2) Coloca essa lista no Map com a chave "Grãos"
        categorias.put("Grãos", graos);

// 3) Agora faça o mesmo pra "Bebidas" com "Café" e "Leite"
        List<String> bebidas = new ArrayList<>();

        bebidas.add("Café");
        bebidas.add("Leite");


        categorias.put("Bebidas", bebidas);

        categorias.get("Bebidas").add("Suco");


    }
}
