package ex_06_Assignments;

import java.util.Scanner;

public class gradecalculator
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = SC.nextInt();
        char grade = 'F';
        if (marks >= 90 && marks <=100){
            grade = 'A';
        }
        else if (marks >=80 && marks>=89){
            grade = 'B';
        }
        else if (marks <=70 && marks>=79){
            grade = 'C';
        }
        else if(marks<=60 && marks>=69){
            grade = 'D';
        }
        else if (marks<=50 && marks >=59){
            grade = 'F';
        }
        else if (marks <=0 && marks >= 40){
            System.out.println("fail");

        }
        System.out.println("your grade is:" + grade);
    }
}
