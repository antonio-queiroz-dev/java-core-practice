package fase03.exe05;

public class PrimeiraPalavraRepetida {
    static void main() {

        PrimeiraPalavraRepetida primeiraPalavraRepetida = new PrimeiraPalavraRepetida();

        String a = "o gato viu o cachorro";
        System.out.printf("esperado: o \nrecebido: " + primeiraPalavraRepetida.primeiraRepetida(a) + "\n");

        String b = "java é bom e java é legal";
        System.out.printf("esperado: java  \nrecebido: " + primeiraPalavraRepetida.primeiraRepetida(b) + "\n");

        String c = "sem repeticao aqui";
        System.out.printf("esperado:  \nrecebido: " + primeiraPalavraRepetida.primeiraRepetida(c) + "\n");

    }

    public String primeiraRepetida(String frase) {
        String[] palavra = frase.split(" ");

        for (int i = 0; i < palavra.length; i++) {
            for (int j = 0; j < i; j++) {
                if (palavra[i].equals(palavra[j])){
                    return palavra[i];
                }
            }
        }
        return "";

    }


}
