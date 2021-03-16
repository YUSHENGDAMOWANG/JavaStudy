package 设计模式;

public class 单例模式 {
    public static void main(String[] args) {
        ClassA a = ClassA.newInstance();
        ClassA b = ClassA.newInstance();
        System.out.println(a == b);
    }
    //饿汉式
    static class  ClassA{
        private static final ClassA instance = new ClassA();
        public static ClassA newInstance(){
            return instance;
        }
        private ClassA(){}
    }
    //懒汉式 需要对象时才创建
    static class ClassB{
        private static ClassB instance = null;
        public static ClassB newInstance(){
            if(instance == null) instance = new ClassB();
            return instance;
        }
        private ClassB(){}
    }

    static class ClassC{
        private static class Holder{
            public static ClassC instance = new ClassC();
        }
        public static ClassC newInstance(){
            return Holder.instance;
        }
        private ClassC(){}
    }
}
