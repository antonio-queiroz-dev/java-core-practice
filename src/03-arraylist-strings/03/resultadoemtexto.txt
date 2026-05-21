package fase03.exe03;

public class Palindromo {
    static void main() {

        Palindromo palindromo = new Palindromo();

        String a = "ana";
        System.out.printf("saida esperada: true \nsaida recebida: " + palindromo.ePalindromo(a) + "\n");

        String b = "Ovo";
        System.out.printf("saida esperada: true \nsaida recebida: " + palindromo.ePalindromo(b) + "\n");

        String c = "Java";
        System.out.printf("saida esperada: false \nsaida recebida: " + palindromo.ePalindromo(c) + "\n");

        String d = "a";
        System.out.printf("saida esperada: true \nsaida recebida: " + palindromo.ePalindromo(d) + "\n");

        System.out.printf("\nversão 2 usando Stringbuilder \n");

        System.out.printf("saida esperada: true \nsaida recebida: " + palindromo.ePalindromo2(a) + "\n");

        System.out.printf("saida esperada: true \nsaida recebida: " + palindromo.ePalindromo2(b) + "\n");

        System.out.printf("saida esperada: false \nsaida recebida: " + palindromo.ePalindromo2(c) + "\n");

        System.out.printf("saida esperada: true \nsaida recebida: " + palindromo.ePalindromo2(d) + "\n");


    }
    public boolean ePalindromo(String texto) {
        String inversao = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            inversao += texto.charAt(i);
        }

        return texto.equalsIgnoreCase(inversao);
    }

    public boolean ePalindromo2(String texto) {
        StringBuilder sb = new StringBuilder();
        return sb.append(texto).reverse().toString().equalsIgnoreCase(texto);
    }
}
