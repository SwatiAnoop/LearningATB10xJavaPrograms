package ex_03_java_Operators;

public class Lab36_inputs
{
    public static void main(String[] args) {
        String string_name = args[0];
        System.out.println(string_name);

        String string_age = args[1];
        int age = Integer.parseInt(string_age);
        System.out.println(age);

        String string_salary = args[2];
        int salary = Integer.parseInt(string_salary);
        System.out.println(salary);
    }
}
