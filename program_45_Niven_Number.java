
/*
Number which is divisible by its sum of digits
Eg;     126
        1+2+6 =9 and 126 is divisible by 9
*/
package Anurag;

import java.util.Scanner;

public class program_45_Niven_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int temp = n, d, s = 0;
        while (temp != 0) {
            d = temp % 10;
            s = s + d;
            temp = temp / 10;
        }
        if (n % s == 0)
            System.out.println("Niven Number");
        else
            System.out.println("NOT");
    }
}
