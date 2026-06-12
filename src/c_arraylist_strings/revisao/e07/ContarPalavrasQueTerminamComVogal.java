package c_arraylist_strings.revisao.e07;

public class ContarPalavrasQueTerminamComVogal {
    // Contar palavras que terminam com vogal
    static void main() {
        String frase = "java casa sol mesa porta lua";
        String[] palavras = frase.split(" ");
        int quantidade = 0;
        String vogais = "aeiou";

        for (int i = 0; i < palavras.length; i++) {
            Character c = palavras[i].charAt(palavras[i].length()-1);
            if (vogais.contains(c.toString())) {
                quantidade +=1;
            }
        }
        System.out.println("Palavras que terminam com vogal: " + quantidade);
    }
}
