package Anurag;

import java.util.Scanner;

public class program_57_sum_of_diagnoals_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n= in.nextInt();
        int a[][]= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]= in.nextInt();
            }
        }
        int s=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j)
                    s= s+a[i][j];
                if (i+j==n-1)
                    s=s+a[i][j];
            }
        }
        s=s-a[m/2][n/2];
        System.out.println(s);
    }
}


