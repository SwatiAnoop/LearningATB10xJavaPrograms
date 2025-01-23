package ex_03_java_Operators;

public class Lab30_nestedternary {
    public static void main(String[] args) {
        int number1 = 65;
        int number2 = 25;
        int number3 = 45;
        int res = (number1 >= number2)? ((number1>=number3) ? number1 : number3) : ((number2>=number3)? number2 : number3);
        System.out.println(res);
    }
}
