import java.util.Scanner;

public class SmallestValueOfAnArray7kyu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {8, 2, 3, 6, 5};
        int[] vectB = {1, 2, 3, 4, 5};
        int findSmallest2 = findSmallest(numbers, "");
        showResults(findSmallest2);
    }
    public static int findSmallest(final int[] numbers, final String toReturn) {
        int menorA = Integer.MAX_VALUE;
        int menorB = 0;
        for (int i = 0; i < numbers.length; i++) {
            int numero = numbers[i];
            if (numero < menorA) {
                menorA = numero;
                menorB = i;
            }
        }
        int resultado = 0;
        if (toReturn.equalsIgnoreCase("value")) {
            resultado = menorA;
        } else {
            resultado = menorB;
        }
        return resultado;
        //Metodo nao muito usado pois dificulta a leitura;
        //toReturn.equalsIgnoreCase("value") ? menorA : menorB;
    }
    public static void showResults(int value) {
        System.out.println(value);
    }
}
