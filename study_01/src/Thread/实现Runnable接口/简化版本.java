package Thread.实现Runnable接口;

public class 简化版本 {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(r).start();

        System.out.println("-====================-");
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        System.out.println("-====================-");
        //lambda表达式
        new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
