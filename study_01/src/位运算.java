import org.junit.Assert;
import org.junit.Test;

public class 位运算  {
    public static void main(String[] args) {
        //位运算符
        System.out.println(1 & 0);
        System.out.println(1 | 0);

        //返回与参数最接近的长整数 参数＋0.5求其 floor
        System.out.println(Math.round(11.5));//12
        System.out.println(Math.round(-11.5));//-11

        /*short s1 = 1;
        s1 = (short) (s1 + 1);*/

        short s1 = 1;
        s1 += 1;

        int [] arr = {1,2,3,4,5};
        //数组的length为数组的属性
        int length = arr.length;
        System.out.println(length);
        //String的length为String的方法
        String s= "12345";
        int length1 = s.length();
        System.out.println(length1);
    }

    public int add(int a,int b){
        return a+b;
    }


    @Test
    public void print(){
        int a=10,b=2;
        Assert.assertEquals(12,a+b);


    }
}
