package c_arraylist_strings.revisao.e03;

public class PalavraMaisLongaDeUmaFrase {
    //Dada uma frase, encontre a palavra mais longa.
    public static void main(String[] args) {

        String frase = "o desenvolvimento de software exige dedicacao constante";
        String[] palavras = frase.split(" ");

        int maior = 0;
        String mais = "";

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maior) {
                maior = palavras[i].length();
                mais = palavras[i];
            }
        }
        System.out.println(mais);
    }
}
