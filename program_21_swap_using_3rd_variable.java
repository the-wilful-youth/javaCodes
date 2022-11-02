package Anurag;

import java.util.Scanner;

public class program_21_swap_using_3rd_variable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Value of a:");
        int a=in.nextInt();
        System.out.println("Enter the Value of b:");
        int b=in.nextInt();
        System.out.printf("Values Before Swap: a=%d  &  b=%d ",a,b);
        int c=a;
        a=b;
        b=c;
        System.out.printf("\n"+"Values After Swap : a=%d  &  b=%d ",a,b);
    }
}
