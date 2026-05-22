package fase01.exe02;

public class contarOcorrencias {
    public static void main(String[] args) {
        int[] n = {2,3,4,5,6,7,8,8,8,3};
        int alvo = 8;
        int cont = 0;

        for (int i = 0; i < n.length; i++) {
            if (alvo == n[i]){
                cont++;
            }

        }
        System.out.println(cont);

    }
}
