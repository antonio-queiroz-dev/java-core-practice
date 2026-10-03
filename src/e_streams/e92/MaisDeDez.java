package e_streams.e92;

import java.util.List;
import java.util.stream.Collectors;

public class MaisDeDez {
    // Títulos de animes: {"Naruto Shippuden", "Death Note", "One Piece", "Steins;Gate", "Spy x Family", "Jujutsu Kaisen", "Mushoku Tensei", "Re:Zero"}.
    // Filtre os que têm mais de 10 caracteres no título, ordene em ordem alfabética, e junte numa String separada por ", ".

    static void main() {
        List<String> animes = List.of("Naruto Shippuden", "Death Note", "One Piece", "Steins;Gate", "Spy x Family", "Jujutsu Kaisen", "Mushoku Tensei", "Re:Zero");

        String resultado = animes.stream()
                .filter( n-> n.length() > 10)
                .sorted()
                .collect(Collectors.joining(", "));

        System.out.println(resultado);

    }
}
