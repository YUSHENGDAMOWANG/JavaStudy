package 设计模式;

public class 代理模式 {
    public static void main(String[] args) {
        Target target = new Target();
        Proxy proxy = new Proxy(target);
        proxy.m1();
        proxy.m2();
        proxy.m3();
    }
    interface Service{
        void m1();
        void m2();
        void m3();
    }
    static class Target implements Service{

        @Override
        public void m1() {
            System.out.println("Target m1");
        }

        @Override
        public void m2() {
            System.out.println("Target m2");
        }

        @Override
        public void m3() {
            System.out.println("Target m3");
        }
    }
    static class Proxy implements Service{

        Service target;
        public Proxy(Service target){
            this.target = target;
        }

        @Override
        public void m1() {
           long t1 = System.nanoTime();
           target.m1();
           long t2 = System.nanoTime();
            System.out.println(t2-t1);
        }

        @Override
        public void m2() {
            long t1 = System.nanoTime();
            target.m2();
            long t2 = System.nanoTime();
            System.out.println(t2-t1);

        }

        @Override
        public void m3() {
            long t1 = System.nanoTime();
            target.m3();
            long t2 = System.nanoTime();
            System.out.println(t2-t1);

        }
    }
}
