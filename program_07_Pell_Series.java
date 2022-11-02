package Anurag;

public class program_07_Pell_Series {
    public static void main(String[] args) {
       int i,a=1,b=0,c;
       for (i=1;i<=12;i++){
           c=a+2*b;
           System.out.print(c+" ");
           a=b;
           b=c;
       }
    }
}
