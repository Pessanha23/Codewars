import java.lang.module.FindException;
import java.nio.file.attribute.UserPrincipal;
import java.util.*;

public class Teste1_2_3_7kyu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>(10);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(number(list));
    }

    public static List<String> number(List<String> lines) {
       ArrayList<String> result = new ArrayList<>();
       int i = 0;
       for (String s : lines){
           result.add(++i + ": " + s);
       }
        return result;
    }
    public static void showResults(int value) {
        System.out.println(value);
    }
}
