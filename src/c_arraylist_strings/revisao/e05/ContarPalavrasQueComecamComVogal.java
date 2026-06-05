package c_arraylist_strings.revisao.e05;

public class ContarPalavrasQueComecamComVogal {
    static void main() {
        //Dada uma frase, conte quantas palavras começam com vogal.

        String frase = "eu gosto de estudar java e programar todo dia";
        String[] palavras = frase.split(" ");
        int quantidadeVogais = 0;

        String vogais = "aeiou";

        for (int i = 0; i < palavras.length; i++){
            Character c = palavras[i].charAt(0);
            if (vogais.contains(c.toString())){
                quantidadeVogais +=1;
            }
        }

        System.out.println("Palavras que começam com vogal: " + quantidadeVogais);
    }
}
