package ex_05_Functions;

import java.util.Scanner;

public class Lab_003_Factorial1
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number");
        int number = SC.nextInt();
        int factorial = 1;
        for (int i = 1; i <=number; i++ ) {
            factorial *= i;
        }
            System.out.println("Factorial of number " + number + factorial);
            SC.close();
        }

    }

