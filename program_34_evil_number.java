package Anurag;

import java.util.*;

public class program_34_evil_number {
    public static void main(String[] args) {
        int num,a,count,c,i;
        int binNum[]=new int[20];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter  a number:");
        num=in.nextInt();
        count=0;
        c=0;
        while(num!=0){
            a=num%2;
            binNum[c]=a;
            if(a==1)
                count++;
            num=num/2;
            c++;
        }
        System.out.println("Total no. of 1="+count);
        for (i=c;i>=0;i--)
            System.out.println(binNum[i]+" ");
        if (count%2==0)
            System.out.println("Evil number");
        else
            System.out.println("Not Evil number");
    }
}
