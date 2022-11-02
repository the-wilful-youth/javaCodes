package Anurag;

import java.util.Scanner;

public class program_37_pronic_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        int ans =0;
        for (int i=0;i<n;i++){
            if(i*(i+1)==n)
            {
                ans=1;
                break;
            }
        }
        if (ans==1)
            System.out.println("Pronic Number");
        else
            System.out.println("Not Pronic NUmber");
    }
}
