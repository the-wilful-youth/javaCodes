package Anurag;

import java.util.Scanner;

public class program_30_first_n_even_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the the term till which u want to print the natural even numbers: \t");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i);
            System.out.print(",");
        }
    }
}
