package Anurag;

import java.util.Scanner;

public class program_54_strength_of_word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sum = sum+ (int)ch;
        }
        System.out.println(sum);
    }
}
