package ex_04_conditions;

import java.util.Scanner;

public class Lab45_largernumber
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = SC.nextInt();
        System.out.println("Enter the num2");
        int num2 = SC.nextInt();
        if(num1 > num2){
            System.out.println("num1 is greater");
        }
        else if (num2 > num1){
            System.out.println("num2 is greater");
        }
        else{
            System.out.println("number is equal");

        }
    }
}
