package Anurag;

import java.util.Scanner;

public class program_26_Ascii_Value {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Character:\t");
        String str=in.next();
        char ch =str.charAt(0);
        int ascii = ch;
        // You can also cast char to int
        //int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        // You can also directly do this
        //System.out.println("The ASCII value of " + ch + " is: " + (int)ch);

        //System.out.println("The ASCII value of " + ch + " is: " + castAscii);

    }
}
