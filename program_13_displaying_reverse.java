package Anurag;
import java.util.Scanner;
public class program_13_displaying_reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = in.nextInt();
        int s = 0;
        while (a > 0) {
            int d = a % 10;
            s = s * 10 + d;
            a = a / 10;
        }
        System.out.println(s);
    }
}
