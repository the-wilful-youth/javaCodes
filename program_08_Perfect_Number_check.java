package Anurag;
import java.util.Scanner;
public class program_08_Perfect_Number_check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n \t");
        int n=in.nextInt();
        int sum=0;
        for (int i=1;i<n;i++) {
            if (n % i == 0)
                sum += i;
        }
        if(sum==n)
            System.out.println("The Number is Perfect");
        else
            System.out.println("No,the number is not perfect");
    }
}

