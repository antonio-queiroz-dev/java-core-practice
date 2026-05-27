package c_arraylist_strings.revisao.e01;

public class InverterPalavrasDeUmaFrase {
    static void main() {
        String frase = "java é uma linguagem poderosa";
        String[] palavras = frase.split( " ");
        String inversao = "";

        for (int i = palavras.length - 1; i >= 0 ; i--) {
             inversao += palavras[i];
             if (i > 0) {
                 inversao += " ";
             }
        }

        System.out.println(inversao);
    }
}
