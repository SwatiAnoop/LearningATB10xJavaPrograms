package ex_04_conditions;

import java.util.Scanner;

public class Lab40_oddeven
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a integer number");
        int number = SC.nextInt();
        if(number %2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        SC.close();

        }
    }



