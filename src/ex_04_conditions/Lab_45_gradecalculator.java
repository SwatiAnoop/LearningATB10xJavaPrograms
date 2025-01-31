package ex_04_conditions;

import java.util.Scanner;

public class Lab_45_gradecalculator {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = SC.nextInt();

        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        }
        // F is the default, so no need for an else block for F

        System.out.println("Grade is: " + grade);
    }
}