import java.util.Scanner;

public class AbbreviateaTwoWordName8kyu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = AbbreviateaTwoWordName8kyu.abbrevName("diega vega");
        System.out.println(x);

    }


    public static String solution(String str) {

        return new StringBuilder(str).reverse().toString();
    }
    /*
    This methos i'm using in Codewars.
    That's my solution.
     */
    public static String abbrevName(String name) {

        int posicaoUltimoEspaco = name.indexOf(" ");

        return name.substring(0,1).toUpperCase()+ "."+ name.substring(posicaoUltimoEspaco + 1,posicaoUltimoEspaco+2).toUpperCase();
    }
    /*
    Another method, for using substring
     */
    public static String abbrevName1(String name) {

        int posicaoUltimoEspaco = name.indexOf("-");

        return name.substring(posicaoUltimoEspaco + 1,posicaoUltimoEspaco+3);
    }
    /*
    Another method, im looking others solution and i'm copied for more analyze.
     */
    public static String abbrevName3(String name) {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }
}

