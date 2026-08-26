package e_streams.e80;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByComTernarioMiasCounting {
    //Uma loja registrou os valores de vendas do dia: {45.0, 120.0, 200.0, 30.0, 85.0, 350.0, 60.0, 150.0}. Agrupe em "Alto"
    // (>= 100.0) e "Baixo" (< 100.0) usando groupingBy com ternário, e conte quantas vendas em cada faixa. Sem consultar.

    public static void main(String[] args) {
        List<Double> vendas = List.of(45.0, 120.0, 200.0, 30.0, 85.0, 350.0, 60.0, 150.0);

        Map<String, Long> resultado = vendas.stream()
                .collect(Collectors.groupingBy(v -> v >= 100 ? "Alto":"Baixo",Collectors.counting()));

        System.out.println(resultado);
    }
}
