package d_hashmap.revisao1.e55;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FiltroMaisContagem {
    // Uma academia registrou os treinos dos alunos na semana:
    // {"Carlos"="Peito", "Ana"="Costas", "Carlos"="Perna", "Bruno"="Peito", "Ana"="Peito", "Carlos"="Costas", "Bruno"="Perna", "Ana"="Perna"}.
    // Conte quantos treinos cada aluno fez. Depois, filtre apenas os alunos que treinaram 3 vezes ou mais.

    static void main() {
        List<String> alunos = List.of("Carlos", "Ana", "Carlos", "Bruno", "Ana", "Carlos", "Bruno", "Ana");
        List<String> treinos = List.of("Peito", "Costas", "Perna", "Peito", "Peito", "Costas", "Perna", "Perna");

        Map<String,Integer> map = new HashMap<>();
        Map<String, Integer> resultado = new HashMap<>();

        for (String a: alunos) {
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() >= 3) {
                resultado.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Todos: " + map);
        System.out.println(resultado);

    }
}
