package Anurag;

import java.util.Scanner;

public class program_27_largestANDsmallest_among_3numbers {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 3 nos. :\t");
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        if(a>b && a>c)
            System.out.println("The Largest No. is "+a);
        else if(b>a && b>c)
            System.out.println("The Largest No. is "+b);
        else
            System.out.println("The Largest No. is "+c);
        if(a<b && a<c)
            System.out.println("The Smallest No. is "+a);
        else if(b<a && b<c)
            System.out.println("The Smallest No. is "+b);
        else
            System.out.println("The Smallest No. is "+c);
    }
}
