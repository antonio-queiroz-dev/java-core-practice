package e_streams.e43;

import java.util.List;

public class FilterMaisCountMaisTernario {
    // Conte quantas senhas são fracas (menos de 6 caracteres). Depois imprima se o sistema está "Seguro" (0 fracas) ou "Em risco" (1 ou mais fracas).

    static void main() {
        List<String> senhas = List.of("abc", "senha123", "ab", "seguranca2025", "oi", "minhasenha");

        Long quantidadeFracas = senhas.stream()
                .filter(n -> n.length() < 6)
                .count();

        String resultado = (quantidadeFracas == 0) ? "Seguro" : "Em risco";

        System.out.println(resultado);


    }
}
