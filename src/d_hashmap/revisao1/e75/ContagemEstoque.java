package d_hashmap.revisao1.e75;

import java.util.HashMap;
import java.util.Map;

public class ContagemEstoque {
    //Uma loja fez a contagem do estoque no fim do mês e comparou com a contagem do mês anterior.
    // Descubra quais produtos tiveram queda na quantidade e quanto cada um caiu.

    static void main() {
        Map<String, Integer> estoqueAnterior = new HashMap<>();
        estoqueAnterior.put("Fone", 10);
        estoqueAnterior.put("Teclado", 5);
        estoqueAnterior.put("Monitor", 8);
        estoqueAnterior.put("Mouse", 12);
        estoqueAnterior.put("Cabo", 20);

        Map<String, Integer> estoqueAtual = new HashMap<>();
        estoqueAtual.put("Fone", 7);
        estoqueAtual.put("Teclado", 5);
        estoqueAtual.put("Monitor", 9);
        estoqueAtual.put("Mouse", 3);
        estoqueAtual.put("Cabo", 20);

        // pensei em armazenar o resultado em um map mas dessa vez fez dessa forma mais simples
        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry:estoqueAnterior.entrySet()) {
            if (entry.getValue() > estoqueAtual.get(entry.getKey())) {
                int diferenca = entry.getValue() - estoqueAtual.get(entry.getKey());
                System.out.println(entry.getKey() + ": caiu " +  diferenca + " unidades");
            }
        }
    }
}
