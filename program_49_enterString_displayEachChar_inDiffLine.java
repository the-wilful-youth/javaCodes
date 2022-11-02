package Anurag;

import java.util.Scanner;

public class program_49_enterString_displayEachChar_inDiffLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i =0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}