package c_arraylist_strings.revisao.e06;

public class SubstituirVogaisPorAsterisco {
    // Dada uma palavra, substitua todas as vogais por *.
    static void main() {
        String palavra = "programacao";
        String vogais = "aeiou";
        String substituicao = "*";
        String saida = "";

        for (Character p: palavra.toCharArray()) {
            if (vogais.contains(String.valueOf(p))) {
                saida += substituicao;
            } else {
                saida += p;
            }
        }
        System.out.println(saida);
    }
}
