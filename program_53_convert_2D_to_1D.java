package Anurag;

import java.util.Scanner;

public class program_53_convert_2D_to_1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 3;
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
        int b[] = new int [9];
        int k=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                b[k++]= a[i][j];
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(b[i]);
        }
    }
}
