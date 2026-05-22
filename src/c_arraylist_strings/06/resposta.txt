package fase03.exe06;

public class Capitalizar {
    public static void main(String[] args) {
        Capitalizar capitalizar = new Capitalizar();

        String a = "eu gosto de java";
        System.out.printf("esperado: Eu Gosto De Java\nrecebido: " + capitalizar.capitalizar(a) + "\n");

        String b = "HELLO WORLD";
        System.out.printf("esperado: Hello World\nrecebido: " + capitalizar.capitalizar(b) + "\n");

        String c = "a";
        System.out.printf("esperado: A\nrecebido: " + capitalizar.capitalizar(c) + "\n");

    }
    public String capitalizar(String frase) {
        String[] palavra = frase.split(" ");
        StringBuilder palavraFinal = new StringBuilder();

        for (String p: palavra) {
            palavraFinal.append(p.substring(0, 1).toUpperCase()).append(p.substring(1).toLowerCase()).append(" ");
        }
        return palavraFinal.toString().trim();
    }
}
