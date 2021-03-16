package Thread.实现Runnable接口;

public class ImplTest {
    public static void main(String[] args) {
        RunnableImpl rb = new RunnableImpl();
        Thread thread = new Thread(rb);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程名字为："+Thread.currentThread().getName()+i);

        }

    }
}
