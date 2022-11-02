package Anurag;

public class program_04_Tribonacci_series {
    public static void main(String[] args) {
        int f=0,s=1,t=1,fr;
        System.out.print(f+" "+s+" "+t);
        for (int i=1;i<=6;i++){
            fr=f+s+t;
            System.out.print(" "+fr);
            f=s;
            s=t;
            t=fr;
        }
    }
}
