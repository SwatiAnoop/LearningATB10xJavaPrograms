package ex_03_java_Operators;

public class Lab34_increment1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //line // Exp1 // value of a
        //6 // 11 // 11
        //6 // 11 // 12
        //6 // 12 // 13
    }
}
