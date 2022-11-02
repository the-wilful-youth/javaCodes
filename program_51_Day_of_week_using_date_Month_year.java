package Anurag;

import java.time.LocalDate;
import java.util.Scanner;

public class program_51_Day_of_week_using_date_Month_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        LocalDate dt = LocalDate.of(year, month, day);
        System.out.println(dt.getDayOfWeek());
        }
    }

