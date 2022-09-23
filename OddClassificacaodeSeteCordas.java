import java.util.Scanner;
public class OddClassificacaodeSeteCordas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String showResults = OddClassificacaodeSeteCordas.sortMyString("");
        System.out.println(showResults);
    }

    public static String sortMyString(String s) {
        s = "Wolfeschlegelsteinhausenbergerdorff";
        String esquerdo = "";
        String direito = "";

        for (int i = 0; i < s.length() ; i++) {
            char x = s.charAt(i);
            String asString = Character.toString(x);
            if (i % 2 == 0) {
                // charAt é o melhor comando para extração de caractere de uam string ....
                // e no metódo for junto com o loopin index (i), ele faz a função de correr e ....
                // ir caractere por caracter.
                esquerdo = esquerdo.concat(asString);
            }
            else {
                direito = direito.concat(asString);
            }
        }
        return esquerdo + " " + direito;
    }
}
