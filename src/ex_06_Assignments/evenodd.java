package ex_06_Assignments;

import java.util.Scanner;

public class evenodd
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number");
        int num = SC.nextInt();
        if ( num % 2 == 0){
            System.out.println("number is even");
        }
        else if (num % 2 != 0){
            System.out.println("number is odd");
        }
    }
}
