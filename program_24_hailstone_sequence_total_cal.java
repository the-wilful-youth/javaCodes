package Anurag;
import java.util.Scanner;
public class program_24_hailstone_sequence_total_cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int c = 0;
        while (num > 1) {
            if (num % 2 == 0)
                num = num / 2;
            else
                num = num * 3 + 1;
            System.out.print(num+" ");
            c++;
        }
        System.out.println("\n" + "Total calculation=" + c);
    }
}
