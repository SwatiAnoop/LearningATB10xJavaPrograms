package ex_03_java_Operators;

public class Lab33_Largestof3
{
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int res = n1>=n2 ? n1 : (n1>=n3 ? n1 : (n2>=n3 ? n2 : n3));
        System.out.println(res);



    }
}
