package b_comparacao_elementos.revisao.e09;

public class ComparacaoEntreElementos {
    //Conte quantos dias tiveram vendas iguais ao dia anterior. Imprima só o número.

    static void main() {
        int[] vendas = {300, 450, 200, 200, 500, 100};
        int vendasIguais = 0;

        for (int i = 0; i < vendas.length -1; i++) {
            if (vendas[i] == vendas[i + 1]) vendasIguais +=1;
        }

        System.out.println(vendasIguais);
    }
}
