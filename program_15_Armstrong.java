package Anurag;
import java.util.Scanner;
public class program_15_Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a=in.nextInt();
        int s=0;int b=a;
        while(a>0){
            int d=a%10;
            s=s+d*d*d;
            a=a/10;
        }
        if (s==b)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
