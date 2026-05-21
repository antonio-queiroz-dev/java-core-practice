package fase04.exe05;

import java.util.HashMap;

public class Anagrama {
    static void main() {
        Anagrama anagrama = new Anagrama();

        String a = "roma";
        String b = "amor";

        String c = "java";
        String d = "vaja";

        String e = "casa";
        String f = "caso";

        String g = "abc";
        String h = "abcd";

        System.out.println("esperado: true \nsaida:" + anagrama.ehAnagrama(a,b) + "\n");
        System.out.println("esperado: true \nsaida:" + anagrama.ehAnagrama(c,d) + "\n");
        System.out.println("esperado: false \nsaida:" + anagrama.ehAnagrama(e,f) + "\n");
        System.out.println("esperado: false \nsaida:" + anagrama.ehAnagrama(g,h) + "\n");
    }

    public boolean ehAnagrama(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else map.put(c,1);
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            } else map2.put(c,1);
        }
        return map.equals(map2);
    }
}
