package ex_05_Functions;

import java.util.Scanner;

public class Lab_002_Factorial
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = SC.nextInt();

        int factorial = number * (number-1);
        System.out.println("Factorial of number=" + factorial);
    }
}
