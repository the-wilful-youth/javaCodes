package Anurag;

import java.util.Scanner;

public class program_56_Nelson_number {
    static int d = 0;
    public int num(int n)
    {
        if(n==0)
            return 1;
        else{
            if(n%10==d){
                return(1* num(n/10));
            }
            else{
                return(0* num(n/10));
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        d= n%10;
        program_56_Nelson_number obj = new program_56_Nelson_number();
        if(n<100){
            System.exit(0);
        }
        else{
            int a = obj.num(n);
            if(a==1)
                System.out.println("Nelson Number");
            else
                System.out.println("not");
        }
    }
}
