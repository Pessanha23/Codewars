import java.util.Scanner;

public class ComplementaryDNA7kyu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teste = "GTAT";
        showResults(makeComplement(teste));
    }

    public static String makeComplement(String dna) {
        StringBuilder receba = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if ('G' == dna.charAt(i)) {
                receba.append('C');
            }
            if ('C' == dna.charAt(i)) {
                receba.append('G');
            }
            if ('T' == dna.charAt(i)) {
                receba.append('A');
            }
            if ('A' == dna.charAt(i)) {
                receba.append('T');
            }
        }
        return receba.toString();
    }
    /*
    Other solution for this exercise, is interested
    String result = "";

     for(char c : dna.toCharArray()){
       switch(c){
         case 'A':
           result += 'T';
           break;
         case 'T':
           result += 'A';
           break;
         case 'G':
           result += 'C';
           break;
         case 'C':
           result += 'G';
           break;
       }
     }
     return result;

     */

    public static void showResults(String value) {
        System.out.println(value);
    }
}
