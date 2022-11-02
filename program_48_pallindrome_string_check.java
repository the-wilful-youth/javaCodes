package Anurag;

import java.util.Scanner;
public class program_48_pallindrome_string_check {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.next();
        int l =s.length()-1;
        String s1="";
        for(int i =0;i<=l;i++){
            char ch = s.charAt(l-i);
            s1= s1+ch;
        }
        boolean t= s1.equalsIgnoreCase(s);
        if(t==true){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not");
        }
    }
}
