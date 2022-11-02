
/*If the number is split into two equals halves and the sum of them is squared is equal to the number
Eg: 3025
Two halves 30   25
Square of sum of halves 3025= (30+25)^2
                              55^2
                              3025
*/


package Anurag;

import java.util.Scanner;

public class program_44_Tech_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the to be checked");
        int n=in.nextInt();
        int l,f;
        l=n%100;
        f=n/100;
        int sq=(int) Math.pow((f+l),2);
        if (n == sq) {
            System.out.println(n+" is a tech number");
        }
        else
            System.out.println(n+" is not a tech number");
    }
}
