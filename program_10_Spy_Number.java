/* A spy number is a number where the sum of its digits
equals the product of its digits.
eg. 1124 -> 1+1+2+4=8 , 1*1*2*4=8
 */

package Anurag;

import java.util.*;
public class program_10_Spy_Number {
    public static void main(String[] args) {
        int no, pro, sum, digit;
        pro = 1;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check spy number :");
        no = sc.nextInt();
        while(no != 0)
        {
            digit = no % 10;
            pro = pro * digit;
            sum = sum + digit;
            no = no / 10;
        }
        if(sum == pro)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}
