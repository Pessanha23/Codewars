public class SquareEveryDigit7kuy {
    public static void main(String[] args) {

        int x = SquareEveryDigit7kuy.squareDigits2(123);
        System.out.println(x);
    }
    public static int squareDigits(int n) {

        char[] digitos = String.valueOf(n).toCharArray();
        String A = "";
        int volta = 0;
        for (char d : digitos) {
            int number = Integer.parseInt(String.valueOf(d));
            A =  A + "" + (int) Math.pow(number, 2);
            volta = Integer.parseInt(A);
        }
        return volta;
    }

    public static int squareDigits2(int n) {
        // NICE CÓDIGOOO
        //Use StringBuffer due to performance
        final StringBuffer result = new StringBuffer();
        int x = 0;

        //As long as we have digits left.
        while (n > 0) {

            //Take the next digit (we are in the decimal system).
            x = n % 10;

            //Delete this digit.
            n = n / 10;

            //Insert at the first position is necessary otherwise we would get a wrong order.
            result.insert(0, x * x);
        }

        return Integer.parseInt(result.toString());
    }
}

