package Anurag;

import java.util.Scanner;

public class program_20_cal_YrMnWkDy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the NUmber:");
        int a=in.nextInt();
        int yr,mon,week,days,z,y;
        yr=a/365;
        z=a%365;
        mon=z/30;
        y=z%30;
        week=y/7;
        days=y%7;
        System.out.println("Year="+yr+"\n"+"Month="+mon+"\n"
                            +"Week="+week+"\n"+"Days="+days);
    }
}
