package c_arraylist_strings.revisao.e02;

public class ContarVogaisEConsoantes {
    public static void main(String[] args) {
        String palavra = "programacao";

        String vogais = "aeiou";
        String consoantes = "bcdfghjklmnpqrstuvwxyz";

        int contVogais = 0;
        int contConsoantes = 0;

        for (Character c : palavra.toCharArray()) {
            if (vogais.contains(String.valueOf(c))) {
                contVogais++;
            } else contConsoantes++;
        }
        System.out.println("Vogais: " + contVogais);
        System.out.println("Consoantes: " + contConsoantes);
    }
}

