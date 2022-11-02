package Anurag;

import java.util.Scanner;

public class program_41_display_1st_n_prime_nos {
    public static void main(String[] args) {
        int n,status=1,num=3;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Value of n:");
        n=in.nextInt();
        if(n>=1){
            System.out.println("First"+n+"prime numbers are:");
            System.out.println("2");
        }
        for(int i=2;i<=n;){
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if(num%j==0)
                {
                    status=0;
                    break;
                }
            }
            if (status !=0) {
                System.out.println(num);
                i++;
            }
            status=1;
            num++;
        }
    }
}
