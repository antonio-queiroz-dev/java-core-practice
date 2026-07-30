package e_streams.e56;

import java.util.List;

public class ReduceComSomaMaisFilter {
    //Filtre apenas os números positivos e some todos usando reduce (com valor inicial 0).
    static void main() {
        List<Integer> numeros = List.of(5, -3, 10, -8, 15, -2, 7);

        Integer resultado = numeros.stream()
                .filter(n -> n >=0)
                .reduce(0,(acumulado,atual) -> acumulado + atual);


        System.out.println(resultado);
    }
}
