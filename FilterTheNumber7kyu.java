import java.util.Arrays;
import java.util.Scanner;

public class FilterTheNumber7kyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String retirar = "4005730389ulzr52nguyoty3039383";
        System.out.println(filterString(retirar));

        sc.close();
    }

    public static long filterString(final String value) {

        return Long.parseLong(value.replaceAll("[\\D]",""));
    }

    public static void showResults(int value) {
        System.out.println(value);
    }
}
