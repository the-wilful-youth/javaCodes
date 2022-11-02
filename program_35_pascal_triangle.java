package Anurag;

import java.util.Scanner;

public class program_35_pascal_triangle {
    public static void main(String[] args) {
        int r,i,k,number,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Rows");
        r = in.nextInt();
        for (i = 0; i < r; i++) {
            for(k=r;k>i;k--){
                System.out.print(" ");
            }
            number=1;
            for(j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
