package Anurag;

import java.util.Scanner;

public class program_19_Calculate_total_zeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = in.nextInt();
        int d,s=0;
        while (n>0){
            d=n%10;
            if(d==0)
                s++;
            n/=10;
        }
        System.out.println("No of zeros="+s);
    }
}
