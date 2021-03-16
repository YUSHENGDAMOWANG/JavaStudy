package practice;

class Test {
    public int aaa() {
        int x = 1;

        try {
            //当执行到return ++x时
            //jvm在执行完++x后会在局部变量表里另外分配一个空间来保存当前x的值。
            return ++x;
        } catch (Exception e) {

        } finally {
            ++x;//2
           // return ++x;//3
        }
        return x;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int y = t.aaa();
        System.out.println(y);
    }
}