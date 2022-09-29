import java.util.Scanner;

public class MaximumTripletSum7kyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] exemplo1 = {3, 2, 6, 8, 2, 3};
        int[] exemplo2 = {2, 1, 8, 0, 6, 4, 8, 6, 2, 4};
        int[] exewmplo3 = {-7, 12, -7, 29, -5, 0, -7, 0, 0, 29};

        int maxTrsum2 = maxTriSum(exemplo1);
        showResults(maxTrsum2);
    }

    public static int maxTriSum(int[] numbers) {
        int maiorA = -1000000;
        int maiorB = -1000000;
        int maiorC = -1000000;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == maiorA || numbers[i] == maiorB || numbers[i] == maiorC) {
            numbers[i] = -1000000;
            }
            if (numbers[i] > maiorA) {
                maiorC = maiorB;
                maiorB = maiorA;
                maiorA = numbers[i];
            } else if (numbers[i] > maiorB) {
                maiorC = maiorB;
                maiorB = numbers[i];
            } else if (numbers[i] > maiorC) {
                maiorC = numbers[i];
            }
        }
        return (maiorA + maiorB + maiorC);
    }

    public static void showResults(int value) {
        System.out.println(value);
    }
}
/*
- Outra solução, utilizando Lambda que foi incrementado no Java11+;
- Estudar mais esse tipo de função que possui mais variáveis para;
 executar alguams lógica de programação com um código mais limpo;

    public static int maxTriSum (int[] numbers)
    {
        return Arrays.stream(numbers)
                .distinct()
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(3)
                .mapToInt(Integer::valueOf)
                .sum();
    }
}
*/