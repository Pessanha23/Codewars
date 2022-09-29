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
        int maiorA = Integer.MIN_VALUE;
        int maiorB = Integer.MIN_VALUE;
        int maiorC = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            //A declaracao abaixo, e uma boa pratica, contudo voce deve se atentar em nao manipular valores inteiros direto no veto posicao numbers[i] (sinal de pessma pratica).
            int numero = numbers[i];
            if (numero == maiorA || numero == maiorB || numero == maiorC) {
            numero = Integer.MIN_VALUE;
            }
            if (numero > maiorA) {
                maiorC = maiorB;
                maiorB = maiorA;
                maiorA = numero;
            } else if (numero > maiorB) {
                maiorC = maiorB;
                maiorB = numero;
            } else if (numero > maiorC) {
                maiorC = numero;
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