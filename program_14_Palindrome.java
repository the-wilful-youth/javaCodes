package Anurag;

import java.util.Scanner;

public class program_14_Palindrome {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int a=in.nextInt();
        int s=0,b=a;
        while (a>0){
            int d=a%10;
            s=s*10+d;
            a=a/10;
        }
        if (s==b)
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}
