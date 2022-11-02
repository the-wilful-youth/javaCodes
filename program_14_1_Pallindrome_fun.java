package Anurag;

import java.util.Scanner;

public class program_14_1_Pallindrome_fun {
    public static void drome(int a)
    {
        int d,rev=0,temp=a;
        while(temp!=0)
        {
            d=temp%10;
            rev=rev*10+d;
            temp=temp/10;
        }
        if (rev==a)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        drome(num);
    }
}


