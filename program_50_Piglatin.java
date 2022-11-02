package Anurag;

import java.util.Scanner;

public class program_50_Piglatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s=s.toUpperCase();
        String s1="";
        int i;
        for (i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                break;
        }
        s1= s.substring(i)+s.substring(0,i)+"AY";
        System.out.println("orginal "+ s);
        System.out.println("piglatin "+s1);
    }
}