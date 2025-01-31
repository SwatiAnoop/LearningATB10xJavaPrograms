package ex_06_Assignments;

import java.util.Scanner;

public class positivenegative
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number");
        int num = SC.nextInt();
        if(num < 0){
            System.out.println("Number is negative");
        }
        else if (num > 0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is equal");
        }
    }
}
