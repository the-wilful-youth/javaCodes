package Anurag;
import java.util.Scanner;
public class program_25_leap_year {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the Year:\t");
        int year =in.nextInt();
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;

            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println("Yes " + year + " is a leap year.");
        else
            System.out.println("No " + year + " is not a leap year.");
    }

}
