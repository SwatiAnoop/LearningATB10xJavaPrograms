package ex_06_Assignments;

import java.util.Scanner;

public class largestof3numbers
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1 = SC.nextInt();
        System.out.println("enter the num2");
        int num2 = SC.nextInt();
        System.out.println("enter the num3");
        int num3 = SC.nextInt();
        if (num1 > num2 && num1>num3){
            System.out.println("num1 is greater");
        }
        else if (num2 > num3 && num2>num3){
            System.out.println("num2 is greater");
        }
        else if(num1 == num2 && num2== num3){
            System.out.println("equal");

        }
        else {
            System.out.println("num3 is greater");
        }
    }
}
