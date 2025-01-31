package ex_05_Functions;

public class Lab_001_Function1
{
    public static void main(String[] args) {
     greet();
     String s = greet_with_hello();
        System.out.println(s);
    }
    //without paramaeter and without return type
    static void greet()
{
    System.out.println("Hi");
}
//without parameter and with retuen type
    static String greet_with_hello(){
        return "Hi how r u";
    }
    static int agr_to_vote()
    {
        System.out.println("calculating age");
        return 18;
    }
}
