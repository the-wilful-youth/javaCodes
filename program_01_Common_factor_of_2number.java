package Anurag;

import java.util.Scanner;

public class program_01_Common_factor_of_2number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(" "+i);
            }
        }
    }
}
