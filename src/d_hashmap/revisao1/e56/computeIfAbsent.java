package d_hashmap.revisao1.e56;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class computeIfAbsent {
    // Uma escola registrou os esportes que cada aluno pratica:
    // {"Lucas"-"Futebol", "Ana"-"Vôlei", "Lucas"-"Basquete","Maria"-"Futebol", "Ana"-"Futebol", "Maria"-"Vôlei", "Lucas"-"Natação"}.
    // Agrupe os esportes por aluno numa List.

    public static void main(String[] args) {
        List<String> alunos = List.of("Lucas","Ana","Lucas","Maria","Ana","Maria","Lucas");
        List<String> esportes = List.of("Futebol","Vôlei","Basquete","Futebol","Futebol", "Vôlei", "Natação");

        Map<String, List<String>> sports = new HashMap<>();

        for (int i = 0; i < alunos.size(); i++) {
            sports.computeIfAbsent(alunos.get(i),k -> new ArrayList<>()).add(esportes.get(i));
        }

        System.out.println(sports);
    }
}
