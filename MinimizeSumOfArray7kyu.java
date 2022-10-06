import java.util.Arrays;
import java.util.Scanner;

public class MinimizeSumOfArray7kyu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vect = {9,2,8,7,5,4,0,6};
        System.out.println(minSum(vect));
    }

    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int soma = 0;
        for (int i = 0; i < passed.length/2; i++) {
        soma += passed[i] * passed[passed.length -1 -i];
        }
        return soma; // Do your magic!
    }

    public static void showResults(int value) {
        System.out.println(value);
    }
}
