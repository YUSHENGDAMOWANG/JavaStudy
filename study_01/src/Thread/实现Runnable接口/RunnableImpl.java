package Thread.实现Runnable接口;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10;i++) {
            System.out.println("当前线程名字为"+Thread.currentThread().getName()+i);
        }
    }
}
