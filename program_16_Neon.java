package Anurag;
import java.util.Scanner;
public class program_16_Neon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = in.nextInt();
        int s=0,b=a*a;
        do{
            int d=b%10;
            s=s+d;
            b/=10;
        }while(b>0);
        if (s==a)
            System.out.println("Neon");
        else
            System.out.println("Not");
    }
}
