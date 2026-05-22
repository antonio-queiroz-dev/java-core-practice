package fase03.exe04;

public class PalavraMaisLonga {
    static void main() {

        PalavraMaisLonga palavraMaisLonga = new PalavraMaisLonga();

        String a = "eu gosto de programar";
        System.out.printf("esperada: programar \nsaida :" + palavraMaisLonga.palavraMaisLonga(a) +"\n");

        String b = "o sol nasceu";
        System.out.printf("esperada: nasceu \nsaida :" + palavraMaisLonga.palavraMaisLonga(b) +"\n");

        String c = "oi";
        System.out.printf("esperada: oi \nsaida :" + palavraMaisLonga.palavraMaisLonga(c) +"\n");

    }

    public String palavraMaisLonga(String frase) {
        String[] palavras = frase.split(" ");
        String maiorPalavra = "";

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maiorPalavra.length()){
                maiorPalavra = palavras[i];
            }
        }
        return maiorPalavra;
    }
}
