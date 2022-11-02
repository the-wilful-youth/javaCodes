/* Sum of all factors excluding the no. equals to the number*/

package Anurag;
import java.util.Scanner;
public class program_09_Prime_Number_check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to be checked:\t");
        int num=in.nextInt();
        int i,f=1;
        for (i=2;i<num;i++){
            if (num%i==0){
                f=0;
                break;
            }
        }
        if (f==1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
