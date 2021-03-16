package practice;

public class 局部变量 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a);//1
        System.out.println(b);//2
        change(a, b);//
        System.out.println(a);//1
        System.out.println(b);//2
    }
    public static void change(int a, int b) {
        a = a + b; //a=1+2=3,b=2
        b = b + a;
    }

}
