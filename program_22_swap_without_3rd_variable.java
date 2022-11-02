package Anurag;
import java.util.Scanner;
public class program_22_swap_without_3rd_variable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Value of a:");
        int a=in.nextInt();
        System.out.println("Enter the Value of b:");
        int b=in.nextInt();
        System.out.printf("Values Before Swap: a=%d  &  b=%d ",a,b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("\n"+"Values After Swap : a=%d  &  b=%d ",a,b);

    }
}
