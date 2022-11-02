
/*
A happy number is which eventual sum of the square of the number is one.
Eg 19
    1^2 + 9^2       =   1+81    = 82
    8^2 + 2^2       =   64+4    = 68
    6^2 + 8^2       =   36+64   = 100
    1^2 + 0^2 +0^   =   1+0+0   = 1
*/
package Anurag;

import java.util.Scanner;

public class program_46_Happy_Number {
    public int sumSqDigit(int n){
        int sum=0;
        while (n!=0){
            int d=n%10;
            sum=sum+d*d;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        program_46_Happy_Number obj =new program_46_Happy_Number();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int temp=n;
        while (temp>9){
            temp = obj.sumSqDigit(temp);
        }
        if (temp==1)
            System.out.println(n+"is a happy number");
        else
            System.out.println(n+"not a happy number");
    }
}