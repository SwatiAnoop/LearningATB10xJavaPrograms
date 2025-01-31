package ex_06_Assignments;

import java.util.Scanner;

public class eligibletovote
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the age");
        int age = SC.nextInt();
        if (age >= 18){
            System.out.println("Allowed to vote");
        }
        else if(age <= 18){
            System.out.println("not allowed to vote");
        }
    }
}
