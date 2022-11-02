package Anurag;

import java.util.Scanner;

public class program_43_Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Binary Code");
        int n=in.nextInt();
        int t=n;
        int i=0,d=0;
        while (t>0){
            int r=t%10;
            t=t/10;
            d=d+r*(int) Math.pow(2,i);
            i++;
        }
        System.out.println(d);
    }
}
