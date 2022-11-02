package Anurag;

import java.util.Scanner;

public class program_39_titanic_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        int d=0,s=0,p=1;
        while (n>0){
            d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        if (s==p)
            System.out.println("Titanic Number");
        else
            System.out.println("Not a Titanic Number");
    }
}
