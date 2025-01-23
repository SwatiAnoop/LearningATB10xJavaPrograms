package ex_03_java_Operators;

public class Lab31_increment_decrement {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        String res = age > 18? "yes" : "No";
        System.out.println(res);
    }
}
