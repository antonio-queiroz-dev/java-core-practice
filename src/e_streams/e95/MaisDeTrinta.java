package e_streams.e95;

import java.util.List;
import java.util.stream.Collectors;

public class MaisDeTrinta {
    // Monte uma linha de texto com os nomes, em letras maiúsculas, dos funcionários com menos de 30 anos, em ordem alfabética, separados por ", ".

    static void main() {
        record Funcionario(String nome, String setor, int idade) {}

        List<Funcionario> funcionarios = List.of(
                new Funcionario("Ana", "TI", 28),
                new Funcionario("Bruno", "Vendas", 35),
                new Funcionario("Carla", "TI", 24),
                new Funcionario("Diego", "RH", 31),
                new Funcionario("Eduarda", "Vendas", 29),
                new Funcionario("Felipe", "TI", 26)
        );

        String resultado = funcionarios.stream()
                .filter(f -> f.idade() < 30)
                .map(f -> f.nome().toUpperCase())
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(resultado);
    }
}
