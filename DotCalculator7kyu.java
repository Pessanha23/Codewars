import java.util.Scanner;

public class DotCalculator7kyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String caractere = DotCalculator7kyu.calc("..... + ...............");
        System.out.println(caractere);

        String caractere2 = DotCalculator7kyu.conversao(10);
        System.out.print(caractere2);
    }

    /*
    1° - Considerar um número a quantidade de pontos "...";
    2° - Somar ou fazer algum outro operação matemática e dar resultado em String;
    2° - Dar o resultado em String;
     */
    public static String conversao(long calc) {

        String zero1 = "";
        for (int i = 1; i <= calc; i++) {
            zero1 = zero1 + ".";
        }
        return zero1;
    }
    public static String calc(String txt) {
        long totalfinal = 0;
        long leftpoint = 0;
        long pontosdir;
        long totalcharacters;
        long rightfinal = 0;

        if (txt.contains(".")) {
            leftpoint = txt.indexOf(' ');
            pontosdir = txt.lastIndexOf(' ');
            totalcharacters = (txt.length() - 1);
            rightfinal = totalcharacters - pontosdir;
            totalfinal = leftpoint - rightfinal;
        }
        if (txt.contains("-")) {
            totalfinal = leftpoint - rightfinal;
        }
        if (txt.contains("+")) {
            totalfinal = leftpoint + rightfinal;
        }
        if (txt.contains("//")) {
            totalfinal = leftpoint / rightfinal;
        }
        if (txt.contains("*")) {
            totalfinal = leftpoint * rightfinal;
        }
        String zero1 = "";

        for (int i = 1; i <= totalfinal; i++) {
            zero1 = zero1.concat(".");
        }
        return zero1;
    }
}

