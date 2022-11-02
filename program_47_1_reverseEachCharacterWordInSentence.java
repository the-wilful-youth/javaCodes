package Anurag;
import java.util.*;

public class program_47_1_reverseEachCharacterWordInSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        String s= in.nextLine();
        StringTokenizer str = new StringTokenizer(s);
        String s1 =" ";
        while (str.hasMoreTokens()){
            String k = str.nextToken();
            for (int i = 0; i < k.length(); i++) {
                char c =k.charAt(i);
                s1=c+s1;
            }
            System.out.println(s1+ " ");
            s1=" ";
        }
    }
}
