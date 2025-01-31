package ex_04_conditions;

import java.util.Scanner;

public class Lab42_if2
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = SC.nextInt();
        if (age >=18)
        {
            System.out.println("allowed to vote");
        }
        else {
            System.out.println("not allowed");
        }
    }
}
