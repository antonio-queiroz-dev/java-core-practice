    package e_streams.e52;

    import java.util.List;
    import java.util.Map;
    import java.util.stream.Collectors;

    public class GroupingByComTernarioMaisCounting {
        // Agrupe os salários em "Até 2000" e "Acima de 2000", e conte quantos há em cada grupo.

        public static void main(String[] args) {
            List<Double> salarios = List.of(1200.0, 3500.0, 980.0, 5200.0, 1500.0, 4000.0, 2800.0);

            Map<String, Long> resultado = salarios.stream()
                    .collect(Collectors.groupingBy(
                            salario -> salario <= 2000 ? "Até 2000": "Acima de 2000",Collectors.counting()));

            System.out.println(resultado);
        }
    }
