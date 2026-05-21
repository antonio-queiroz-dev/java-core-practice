package fase04.exe03;

import java.util.HashMap;

public class ContarFrequenciaPalavras {
    static void main() {
        ContarFrequenciaPalavras contarFrequenciaPalavras = new ContarFrequenciaPalavras();

        String a =  "o gato viu o gato";
        System.out.println("Esperado {o=2, gato=2, viu=1}\nSaida: 7894904271733" +
                "  "+ contarFrequenciaPalavras.contarPalavras(a) + "\n");

        String b =  "java java java";
        System.out.println("Esperado {java=3}\nSaida:   "+ contarFrequenciaPalavras.contarPalavras(b) + "\n");

        String c =  "eu sou eu";
        System.out.println("Esperado {eu=2, sou=1}\nSaida:   "+ contarFrequenciaPalavras.contarPalavras(c) + "\n");
    }
    public HashMap<String, Integer> contarPalavras(String frase) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] palavra = frase.split(" ");


        for (String p: palavra) {
            if (map.containsKey(p)){
                map.put(p,map.get(p)+1);
            } else {
                map.put(p,1);
            }
        }
    return map;
    }
}
