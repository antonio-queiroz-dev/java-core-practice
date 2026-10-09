package e_streams.e94;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutosEletronicos {
    // Você tem uma lista de produtos de uma loja. Monte uma única linha de texto com os produtos da categoria "Eletrônico"
    // que custam mais de 100 reais, do mais caro pro mais barato, no formato Nome (R$ preco), separados por " | ".

    public static void main(String[] args) {
        record Produto(String nome, double preco, String categoria) {}

        List<Produto> produtos = List.of(
                new Produto("Fone", 199.90, "Eletrônico"),
                new Produto("Teclado", 89.90, "Eletrônico"),
                new Produto("Monitor", 899.00, "Eletrônico"),
                new Produto("Cadeira", 750.00, "Móveis"),
                new Produto("Mouse", 129.50, "Eletrônico"),
                new Produto("Mesa", 450.00, "Móveis")
        );

        String resultado = produtos.stream()
                .filter(p -> p.categoria().equals("Eletrônico") && p.preco() > 100)
                .sorted(Comparator.comparingDouble(Produto::preco).reversed())
                .map(p -> p.nome() + " R$ " + p.preco())
                .collect(Collectors.joining(" | "));

        System.out.println(resultado);

    }
}
