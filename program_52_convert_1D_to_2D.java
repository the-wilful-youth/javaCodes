package Anurag;

public class program_52_convert_1D_to_2D {
    public static void main(String[] args) {
        int m = 3;
        int a[]={1,2,3,1,2,3,1,2,3};
        int b[][] = new int [3][3];
        int k=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                 b[i][j]=a[k++];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(b[i][j]);
            }
        }
    }
}
