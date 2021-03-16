package practice;

public class short计算 {
    public static void main(String[] args) {
        System.out.println("5+5="+5+5);//输出5+5=55

        System.out.println("================");
        short s = 1;
        s+=1;
        System.out.println(s);
        /*
        * 分析： s += 1 逻辑上看作是 s = s + 1 计算结果被提升为int类型，
        * 再向short类型赋值时发生错误，因为不能将取值范围大的类型赋值到取值范围小的类型。
        * 但是， s=s+1进行两次运算 ， += 是一个运算符，只运算一次，并带有强制转换的特点，
        * 也就是说 s += 1 就是 s = (short)(s + 1) ，因此程序没有问题编译通过，运行结果是2.
        * */
        System.out.println("================");
        short a = 1;
        a = (short) (a + 1);
        System.out.println(a);

        System.out.println("================");
        byte b1=1;
        byte b2=2;
        byte b3=1 + 2;
        System.out.println(b3);
        /*byte b4=b1 + b2;
        System.out.println(b4);*/
        /*
        *分析： b3 = 1 + 2 ， 1 和 2 是常量，为固定不变的数据，在编译的时候（编译器javac），
        * 已经确定了 1+2 的结果并没有超过byte类型的取值范围，可以赋值给变量 b3 ，因此 b3=1 + 2 是正确的。
        * 反之， b4 = b1 + b2 ， b2 和 b3 是变量，变量的值是可能变化的，
        * 在编译的时候，编译器javac不确定b2+b3的结果是什么，
        * 因此会将结果以int类型进行处理，所以int类型不能赋值给byte类型，因此编译失败。
        */

    }
}
