package Anurag;

import java.util.Scanner;

public class program_08_1_Perfect_fun {
    public static void perfect(int a){
        int sum=0;
        for (int i=1;i<a;i++){
            if (a % i == 0) {
                sum=sum+i;
            }
        }
        if (sum == a)
            System.out.println("Perfect Number");
        else
            System.out.println("not Perfect");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        perfect(num);
    }
}
