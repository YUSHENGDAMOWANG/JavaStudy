package 匿名类;

public class TestImpl{
    public static void main(String[] args) {
        test obj = new test() {
            @Override
            public void method() {
                System.out.println("匿名类实现了方法！");

            }

        };
        obj.method();
    }
}
