package ex_03_java_Operators;

public class Lab39_Gradecalculator
{
    public static void main(String[] args) {
        int marks =99;
        String garde_calculator = (marks >= 90 && marks <= 100)? "A" : (marks >= 80 && marks <= 89)? "B" :(marks >= 70 && marks <= 79)? "c" : (marks <= 60 && marks >=69)? "D": "invalid";
        System.out.println("Grade is:" + garde_calculator);
    }
}
