package Thread.继承Thread类;

public class MyThreadDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程名字为"+Thread.currentThread().getName()+i);
        }
    }
}
