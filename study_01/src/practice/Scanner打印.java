package practice;

import java.util.Scanner;

public class Scanner打印 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入A的值：");
        int a = sc.nextInt();
        System.out.println("请输入B的值：");
        int b = sc.nextInt();
        System.out.println("请输入C的值：");
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("ABC中三个数最大的数是"+max);

    }
}
