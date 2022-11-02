package Anurag;
public class program_40_display_all_palindromeNUM1to100 {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            int temp=i,rev=0,d;
            while(temp!=0)
            {
                d=temp%10;
                rev = (rev * 10) + d;
                temp=temp/10;
            }
            if(rev==i)
                System.out.println(i+" is a palindrome number") ;
            else
                System.out.println(i+" is not a Palindrome number ");
        }
    }
}
