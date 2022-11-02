package Anurag;
import java.util.Scanner;
public class program_31_displaying_all_terms_of_a_3digit_no {
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a three digit number:\t");
        d=s.nextInt();
        a=d%10;
        b=d/10;
        e=b%10;
        c=d/100;
        System.out.println("hundreds' digit:"+c);
        System.out.println("tens' digit:"+e);
        System.out.println("unit's digit:"+a);

    }
}
