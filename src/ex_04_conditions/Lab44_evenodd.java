package ex_04_conditions;

import java.util.Scanner;

public class Lab44_evenodd
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number");
        int number = SC.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Number is even");

        }
        else {
            System.out.println("Number is odd");
        }
    }
}
