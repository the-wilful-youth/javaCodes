package Anurag;

import java.util.Scanner;

public class program_18_Buzz_number_check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int i=in.nextInt();
        if((i%7==0)||(i%10==7))
            System.out.println("Yes The number is Buzz Number");
        else
            System.out.println("Not a buzz Number");
    }
}
