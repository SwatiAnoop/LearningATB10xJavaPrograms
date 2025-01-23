package ex_03_java_Operators;

public class Lab38_largestof3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3000;
        int z = 100;
        int max = (x > y)? x :(x > z)? x :(y > z)? y : z;
        System.out.println(max);
    }
}
