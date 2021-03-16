package Thread.继承Thread类;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThreadDemo my = new MyThreadDemo();
        my.start();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("当前线程名字为main"+i);
        }
    }

}
