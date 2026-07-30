    package c_arraylist_strings.revisao.e12;

    public class ArrayListMaisString {
        //Separe com split(" ") e conte quantas palavras são números (ou seja, todos os caracteres são dígitos). Imprima só o número.

        static void main() {
            String frase = "Pedro comprou 3 pães e 12 ovos e 1 litro de leite";

            String[] palavras = frase.split(" ");
            int quantidade = 0;

            for (String p: palavras) {
                if (p.matches("[0-9]+")) {
                    quantidade++;
                }
            }

            System.out.println(quantidade);
        }
    }
