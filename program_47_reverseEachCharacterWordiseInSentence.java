package Anurag;

import java.util.Scanner;

public class program_47_reverseEachCharacterWordiseInSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = in.nextLine();
        s= s+" ";
        String s1 ="";
        String s3="";
        String s2="";
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if (ch != ' '){
                s1 =s1+ch;
            }
            else{
                for(int j =0;j< s1.length(); j++){
                    char c = s1.charAt(j);
                    s2=c+s2;
                }
                s2=s2+" ";
                s3 += s2;
                s2="";
                s1="";

            }
        }
        System.out.println("input:");
        System.out.println(s);
        System.out.println("output:");
        System.out.println(s3);
        System.out.println("abc");
    }
}