package Anurag;
import java.util.Scanner;
public class program_28_positive_or_negative {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to be checked:\t");
        int a=in.nextInt();
        if(a>0)
            System.out.printf("%d is a positive number",a);
        else
            System.out.printf("%d is a negative number",a);
    }
}
