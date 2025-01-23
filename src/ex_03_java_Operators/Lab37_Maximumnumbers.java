package ex_03_java_Operators;

public class Lab37_Maximumnumbers
{
    public static void main(String[] args) {
        String num1 = args[0];
        int x = Integer.parseInt(num1);
        String num2 = args[1];
        int y = Integer.parseInt(num2);
        int max = (x >= y)? x : y;
        System.out.println(max);
    }
}
