package d_hashmap.revisao1.e59;

import java.util.HashMap;
import java.util.Map;

public class Merge {
    //Dois caixas de um mercado registraram quanto venderam por categoria:
    //
    //Caixa 1: {"Frios"=230.0, "Bebidas"=180.0, "Limpeza"=95.0}
    //Caixa 2: {"Bebidas"=120.0, "Limpeza"=65.0, "Padaria"=200.0}
    //
    //Combine num mapa só, somando os valores. Use merge com Double::sum.

    static void main() {
        Map<String, Double> caixa1 = Map.of("Frios" ,230.0, "Bebidas", 180.0, "Limpeza",95.0);
        Map<String, Double> caixa2 = Map.of("Bebidas",120.0, "Limpeza",65.0, "Padaria",200.0);

        Map<String, Double> soma = new HashMap<>();

        for (Map.Entry<String,Double> entry: caixa1.entrySet()) {
            soma.merge(entry.getKey(),entry.getValue(),(antigo, novo) -> antigo + novo);
        }
        for (Map.Entry<String,Double> entry: caixa2.entrySet()) {
            soma.merge(entry.getKey(),entry.getValue(),(antigo, novo) -> antigo + novo);
        }
        System.out.println("Total: " + soma);
    }
}
