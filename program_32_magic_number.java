package Anurag;

import java.util.Scanner;

public class program_32_magic_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=in.nextInt();
        int sum=0,num=n;
        while (num>9) {
            sum=num;
            int s=0;
            while (sum != 0) {
                s = s + (sum % 10);
                sum =sum/ 10;
            }
            num = s;
        }
        if(num==1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic number");
    }
}
