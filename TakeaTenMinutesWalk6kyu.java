import java.util.Scanner;

public class TakeaTenMinutesWalk6kyu {
    public static void main(String[] args) {
        char[] walk = {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
        Scanner sc = new Scanner(System.in);
        showResults(String.valueOf(isValid(walk)));

    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int x = 0;
        int y = 0;

        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') {
                y++;
            }
            if (walk[i] == 's') {
                y--;
            }
            if (walk[i] == 'w') {
                x++;
            }
            if (walk[i] == 'e') {
                x--;
            }
        }
        return x == 0 && y == 0;
    }

    /* Outra solucao, utilizando switch, case and break;
     for (char c: walk) {
      switch (c) {
        case 'n': y++; break;
        case 's': y--; break;
        case 'w': x++; break;
        case 'e': x--; break;
      }
    }
     */
    public static void showResults(String value) {
        System.out.println(value);
    }
}

