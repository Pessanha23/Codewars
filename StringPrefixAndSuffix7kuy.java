import java.util.Scanner;

public class StringPrefixAndSuffix7kuy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int showResults1 = solve(String.valueOf(0));
        System.out.println(showResults1);
    }
    public static int solve(String s) {
        s = "abcd";
        int n = Integer.parseInt(String.valueOf(s.length()));

        if (n < 2) {
            return 0;
        }
        int len = 0;
        int i = (n+1)/2;

        while (i < n ) {
            if ( s.charAt(i) == s.charAt(len)) {
                len++;
                i++;
            }
            else {
                i = i - len + 1;
                len = 0;
            }
        }
        return len;
    }
}
