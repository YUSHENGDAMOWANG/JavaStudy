package practice;

public class Runnable实现多线程 {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        };

        new Thread(r).start();
        new Thread(r).start();

    }
}
