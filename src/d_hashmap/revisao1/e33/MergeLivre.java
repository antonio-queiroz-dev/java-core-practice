package d_hashmap.revisao1.e33;

import java.util.HashMap;
import java.util.Map;

public class MergeLivre {
    //Some o total de pontos de cada jogador:
    static void main() {
        String[] jogadores = {"Ana", "Bruno", "Ana", "Carlos", "Bruno", "Ana"};
        int[] pontos = {10, 25, 15, 30, 20, 5};

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < jogadores.length; i++) {
            map.merge(jogadores[i], pontos[i],(antigo, novo) -> antigo + novo );
        }

        System.out.println(map);
    }
}
