package Anurag;

import java.util.Scanner;

public class program_12_Twin_prime_Check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first & Second Number:");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int c1=0,c2=0,d;
        for (int i=1;i<=n1;i++) {
            if (n1 % i == 0) {
                c1++;
            }
        }
        for (int i=1;i<=n2;i++) {
            if (n2 % i == 0)
                c2++;
        }
        d=Math.abs(n1-n2);
        if (d==2&&c1==2&&c2==2)
            System.out.println("Yes, Twin Prime");
        else
            System.out.println("No, not Twin prime");
    }
}
