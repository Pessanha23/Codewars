import java.util.Scanner;

public class OddClassificacaodeSeteCordas2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sortMyString("");
        System.out.println(x);
    }

    public static String sortMyString(String s) {
        s = "Wolfeschlegelsteinhausenbergerdorff";
        char[] esquerdo = new char[s.length()];
        // toCharArray usado mais com a funcao Foreach
        char[] direito = s.toCharArray();
        // String direito = "";

        String x = "";
        String y = "";

        for (int i = 0; i < s.length(); i++) {
            esquerdo[i] = s.charAt(i);
            String asString = Character.toString(esquerdo[i]);
            if (i % 2 == 0) {
                 x += s.charAt(i);
            } else {
                y += s.charAt(i);
            }
        }
        return x + " " + y;
    }
}

