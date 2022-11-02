package Anurag;

import java.util.Scanner;

public class program_02_factorial_iterative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want :\t");
        int n=in.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.printf("The factorial of %d is %d",n,fact);
    }
}
