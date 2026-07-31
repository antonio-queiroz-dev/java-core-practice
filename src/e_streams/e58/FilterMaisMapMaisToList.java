package e_streams.e58;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMaisMapMaisToList {
    // Filtre os emails do gmail, extraia apenas o nome (parte antes do @), e devolva em uma lista.

    static void main() {
        List<String> emails = List.of("ana@gmail.com", "bruno@yahoo.com", "carla@gmail.com", "daniel@outlook.com", "eva@gmail.com");

        List<String> resultado = emails.stream()
                .filter(email -> email.endsWith("@gmail.com"))
                .map(email -> email.split("@")[0])
                .collect(Collectors.toList());

        System.out.println(resultado);
    }
}
