package c_arraylist_strings.revisao.e09;

public class ArrayListMaisString {
    // Separe as palavras com split(" "), percorra com for e descubra quantas vezes a palavra "java" aparece. Imprima só o número.

    static void main() {
        String frase = "java é a linguagem que eu mais estudo e java é o que eu quero trabalhar";
        String[] palavras = frase.split(" ");
        int contJava = 0;

        for (String p: palavras) {
            if (p.equals("java")) contJava +=1;
        }

        System.out.println(contJava);
    }
}
