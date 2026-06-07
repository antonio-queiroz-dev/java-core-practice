package e_streams.e02;

import java.util.List;

public class TransformarComMap {
    // Dada uma lista de nomes, transforme todos em maiúsculo.
    static void main() {
        List<String> nomes = List.of("junior", "ana", "carlos", "maria");

        List<String> nomesMaisculos = nomes.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(nomesMaisculos);
    }
}
