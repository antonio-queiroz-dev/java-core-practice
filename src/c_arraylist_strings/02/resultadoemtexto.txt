package fase03.exe02;

public class InverterUmaString {
    public static void main(String[] args) {

        InverterUmaString inverterUmaString = new InverterUmaString();

        String a = "casa";
        System.out.println("saida esperada: asac saida: " + inverterUmaString.inverterString(a));

        String b = "Java";
        System.out.println("saida esperada: avaJ saida: " + inverterUmaString.inverterString(b));

        String c = "a";
        System.out.println("saida esperada: a saida: " + inverterUmaString.inverterString(c));
        System.out.printf("\nversão 2 ==>\n");

        System.out.printf("esperada: asac \nsaida   : " + inverterUmaString.inverterString2(a) + "\n");

        System.out.printf("esperada: avaJ \nsaida   : " + inverterUmaString.inverterString2(b) + "\n");

        System.out.printf("esperada: a \nsaida:    " + inverterUmaString.inverterString2(c) + "\n");

        System.out.printf("\nversão 3 ==>\n");
        System.out.printf("esperada: asac \nsaida   : " + inverterUmaString.inverterString3(a) + "\n");

        System.out.printf("esperada: avaJ \nsaida   : " + inverterUmaString.inverterString3(b) + "\n");

        System.out.printf("esperada: a \nsaida:    " + inverterUmaString.inverterString3(c) + "\n");


    }

    public String inverterString(String texto) {
        String resultado = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }

    public String inverterString2(String texto) {
        String resultado = "";
        StringBuilder sb = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            sb.append(texto.charAt(i));
        }
        resultado = sb.toString();

        return resultado;
    }

    public String inverterString3(String texto) {
        StringBuilder sb = new StringBuilder();
        String resultado = sb.append(texto).reverse().toString();
        return resultado;
    }
}
