package Anurag;

import java.util.Scanner;

public class program_55_Karpekar_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int c =0;
        while (temp!=0){
            int d = temp%10;
            c++;
            temp/=10;
        }
        int sq =n*n;
        int first = sq/(int) Math.pow(10,c);
        int second = sq%(int) Math.pow(10,c);
        int sum = first+second;
        if (sum==n)
            System.out.println("Karpekar Number");
        else
            System.out.println("Not a Karpekar Number");
    }
}
