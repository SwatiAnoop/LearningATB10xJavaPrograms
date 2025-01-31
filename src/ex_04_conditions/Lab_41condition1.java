package ex_04_conditions;

import java.util.Scanner;

public class Lab_41condition1
{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("eneter the score");
        int score = SC.nextInt();
        char grade = 'F';
        if(score <= 90 && score>=100)
        {
            grade = 'A';
        }
        else if (score <= 80 && score >= 89)
        {
            grade = 'B';
        }
        else if (score <= 70 && score >= 79) {
            grade = 'c';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade is: " + grade);

        }
    }

