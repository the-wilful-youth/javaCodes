package Anurag;

import java.util.Scanner;

public class program_29_Even_or_Odd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to be checked:\t");
        int a=in.nextInt();
        if (a%2==0)
            System.out.printf("%d is a Even number",a);
        else
            System.out.printf("%d is a Odd Number",a);
    }
}
