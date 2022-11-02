package Anurag;
import java.util.Scanner;
public class program_11_triangle_possibility {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sides");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if ((a+b>c)&&(b+c>a)&&(c+a>b))
            System.out.println("Triangle Possible");
        else
            System.out.println("Not Possible");
    }
}
