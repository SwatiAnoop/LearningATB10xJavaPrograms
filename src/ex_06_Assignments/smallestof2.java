package ex_06_Assignments;

import java.util.Scanner;

public class smallestof2
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1 = SC.nextInt();
        System.out.println("enter the num2");
        int num2 = SC.nextInt();
        if (num1 < num2){
            System.out.println("num1 is smaller");
        }
        else if (num2 < num1){
            System.out.println("num2 is smaller");
        }
        else{
            System.out.println("both are equal");
        }
    }
}
