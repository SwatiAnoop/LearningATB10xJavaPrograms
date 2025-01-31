package ex_06_Assignments;

import java.util.Scanner;

public class leapyear
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the year");
        int year = SC.nextInt();
        if (year % 4 == 0 && year %400 == 0){
            System.out.println("year is leap year");
        }

        else{
            System.out.println("year is not leap year");
        }
    }
}
