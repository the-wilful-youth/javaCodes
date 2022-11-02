package Anurag;

import java.util.Scanner;
public class program_06_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = 0;
        for (int i =1; i <=a; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
            System.out.println(hcf);
    }
}
