package Anurag;
public class program_03_fibonacci_Series {
    public static void main(String[] args) {
        int f=0,s=1,t;
        System.out.print(f+" "+s);
        for (int i=1;i<=6;i++){
            t=f+s;
            System.out.print(" "+t);
            f=s;
            s=t;
        }
    }
}
