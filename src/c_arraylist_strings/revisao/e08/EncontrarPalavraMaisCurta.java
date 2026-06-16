package c_arraylist_strings.revisao.e08;

public class EncontrarPalavraMaisCurta {
    //Dada uma frase, encontre a palavra mais curta.
    static void main() {
        String frase = "eu gosto muito de programar em java";
        String[] palavras = frase.split(" ");
        String menorPalavra = palavras[0];

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() < menorPalavra.length()) {
                menorPalavra = palavras[i];
            }
        }

        System.out.println("Palavra mais curta: " + menorPalavra + " (" + menorPalavra.length() + " letras)");
    }
}
