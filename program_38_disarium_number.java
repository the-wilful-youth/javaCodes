package Anurag;

import java.util.Scanner;

public class program_38_disarium_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=in.nextInt();
        int copy=num,d=0,sum=0,copy2=num;
        int len=0,c=0;
        while(copy2>0){
            c=copy2%10;
            len++;
            copy2=copy2/10;
        }
        while (copy>0){
            d=copy%10;
            sum=sum+(int) Math.pow(d,len);
            len--;
            copy=copy/10;
        }
        if (sum==num)
            System.out.println("Disarium Number");
        else
            System.out.println(" Not Disarium Number");
    }
}
