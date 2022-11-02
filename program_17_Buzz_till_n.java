package Anurag;

import java.util.Scanner;

public class program_17_Buzz_till_n {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the NUmber:");
        int n=in.nextInt();
        int i=1;
        do {
            if ((i%7==0)||(i%10==7)){
                System.out.println(i);
            }
            i++;
        }while (i<=n);
    }
}
