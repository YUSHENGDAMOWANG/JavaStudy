package practice;

import org.junit.Test;

import java.util.Scanner;

public class case测试 {
    public static void main(String[] args) {
        int day = 1;
        System.out.println("请输入今天的日子：");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("今天是星期一");
                break;
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期三");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            case 7:
                System.out.println("今天是星期天");
                break;
            default:
                System.out.println("你输入的数字有误！");
                break;
        }
    }
    @Test
    public void test(){
        /*
        * 上述程序中，执行case5后，由于没有break语句，程序会一直向后走，
        * 不会再判断case，也不会理会break，直接运行完整体switch。
        * */
            int i = 5;
            switch (i){
                case 0:
                    System.out.println("执行case0");
                    break;
                case 5:
                    System.out.println("执行case5");
                case 10:
                    System.out.println("执行case10");
                    break;
                default:
                    System.out.println("执行default");
            }
    }
}
