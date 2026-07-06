package c_arraylist_strings.revisao.e10;

public class ArrayListMaisString {
    // Separe com split(" ") e conte quantas palavras começam com a letra "r". Imprima só o número.
    static void main() {
        String frase = "o rato roeu a roupa do rei de roma";
        String[] palavras = frase.split(" ");
        int comecaR = 0;
        String letra = "R";


        for (String p: palavras) {
            if (p.toUpperCase().charAt(0) == 'R') comecaR +=1;
        }

        System.out.println(comecaR);

        comecaR = 0;

        for(String p: palavras) {
            if (p.toUpperCase().startsWith(letra)) comecaR +=1;
        }

        System.out.println(comecaR);
    }
}
