package Anurag;

import java.util.Scanner;

public class program_23_hailstone_sequence_with_rollback_of10calc_totalCalc_totalLines {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        int c=0,i=1;
        while(num>1) {
            if (num % 2 == 0)
                num = num / 2;
            else
                num = num * 3 + 1;
            c++;
            if (c % 10 == 0) {
                i++;
                System.out.println(num);
            }
            else
                System.out.print(num + " ");
        }
        System.out.println("\n"+"Total calculation="+c);
        System.out.println("Total Lines ="+i);
    }
}
