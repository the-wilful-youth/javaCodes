package Anurag;

import java.util.Scanner;

public class program_42_Decimal_to_binary {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner in= new Scanner(System.in);
        String b =" ";
        int num = in.nextInt();
        int t=num;
        while (t>0){
            int r =t%2;
            t=t/2;
            b=r+b;
        }
        System.out.println("Binary Number equivalent of "+num+" is "+b);
    }
}
