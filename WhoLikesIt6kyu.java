import java.util.Scanner;

public class WhoLikesIt6kyu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        showResults(whoLikesIt("Diega", "Matheus", "Stefanini", "Joana", "Gamiguela"));
    }
    //String... name - é um vetor, mas quando um metodo obetiver mais de um vetor como parametro, então não da pra utlizar String, Int ou Double...
    public static String whoLikesIt(String... names) {
        if (1 == names.length) {
            return names[0] + " likes this";
        }
        if (2 == names.length) {
            return names[0] + " and " + names[1] + " like this";
        }
        if (3 == names.length) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        if (4 <= names.length) {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
        String resultado = "no one likes this";
        if (0 == names.length) {
            return resultado;
        }
        return "";
    }

    public static void showResults(String whoLikesIt) {
        System.out.println(whoLikesIt);
    }
}
