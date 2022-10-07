import java.util.Scanner;

public class SortedYesNoHow7kyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] teste = {-50, -8, 10,25,35};

        System.out.println(isSortedAndHow(teste));
        sc.close();
    }

    public static String isSortedAndHow(int[] array) {
        int menorA = Integer.MIN_VALUE;
        int menorB = Integer.MIN_VALUE;
        int maiorC = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < array.length; i++) {

            if (array[i] > menorA) {
                menorB = menorA;
                menorA = array[i];
                result = "yes, ascending";
            }
           else if (array[i] < maiorC) {
                maiorC = array[i];
                result = "yes, descending";
            }
            if (maiorC < menorB && menorB < menorA) {
                return "no";
            }
        }
        return result;
    }

    public static void showResults(String value) {
        System.out.println(value);
    }
}
