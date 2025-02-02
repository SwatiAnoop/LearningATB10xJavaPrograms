package ex_07_Functions;

public class Function1
{
    public static void main(String[] args) {
        //without parameters and without return type
        greet();
        //without parameters and with return type
        String S = greet_with_hello();
        System.out.println(S);
        //without parameters and with return type
        int vote_toage_person = age_to_vote();
        System.out.println(vote_toage_person);
        //with parameters and without return type
        greet_with_name("swati");
        greet_with_name("Anoop");
        greet_with_fullname("swati", "Anoop");

    }
    ///without parameters and without return type
    static void greet()
    {
        System.out.println("Hi I am without parameters and without return type ");
    }
    //without parameters and with return type
    static String greet_with_hello(){
        return "Hi i am without parameters and with return type";
    }
    //without parameters and with return type
    static int age_to_vote(){
        return 18;
    }
    //with parameters and without return type
    static void greet_with_name(String name){
        System.out.println("Hi my name is:" + name);
    }
    static void greet_with_fullname(String first_name, String last_name){
        System.out.println("Hi your name is:" + first_name + last_name);
    }


}
