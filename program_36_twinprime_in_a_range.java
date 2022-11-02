package Anurag;

import java.util.Scanner;

public class program_36_twinprime_in_a_range {
    public static boolean isPrime(int n)
    {
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter lower limit");
        int p=in.nextInt();
        System.out.println("Enter Upper limit");
        int q=in.nextInt();
        if (p>q)
            System.out.println("Invalid Range");
        else
        {
            System.out.println("twin prime within the range");
            for (int i=p;i<=(q-2);i++){
                if ( isPrime(i) && isPrime(i + 2))
                    System.out.println(i+","+(i+2));
            }

        }
    }
}
