package Anurag;

import java.util.Scanner;

public class program_33_automorphic_number {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num=in.nextInt();
        int c=0,sqr=num*num;
        int temp=num;
        while (temp>0) {
            c++;
            temp=temp/10;
        }
        int lastSquareDigits=(int)(sqr%(Math.pow(10,c)));
        if (num==lastSquareDigits)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}
