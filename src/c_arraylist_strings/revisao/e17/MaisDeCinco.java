package c_arraylist_strings.revisao.e17;

import java.util.ArrayList;
import java.util.List;

public class MaisDeCinco {

    // Você tem uma lista de nomes completos. Monte uma nova lista contendo só o primeiro nome de cada pessoa,
    // e depois informe quantos desses primeiros nomes têm mais de 5 letras.
    static void main() {
        List<String> nomes = new ArrayList<>(List.of(
                "Ana Souza", "Bruno Lima", "Carla Mendes", "Diego Alves", "Eduarda Rocha"
        ));


        List<String> primeiroNome = new ArrayList<>();

        for (String n: nomes) {
            String apenasPrimeiro = n.split(" ")[0];
            primeiroNome.add(apenasPrimeiro);
        }

        int maisDecinco = 0;
        for (String p:primeiroNome) {
            if (p.length() > 5) {
                maisDecinco ++;
            }
        }

        System.out.println("Primeiros nomes: " + primeiroNome);
        System.out.println("Nomes com mais de 5 letras: " + maisDecinco);
    }
}
