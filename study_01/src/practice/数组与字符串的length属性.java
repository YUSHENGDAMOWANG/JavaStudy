package practice;

public class 数组与字符串的length属性 {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(arr[0]);//1
        change(arr);
        System.out.println(arr[0]);//200
        //数组.length是其属性
        System.out.println("数组.length是其属性"+arr.length);
        //字符串.length是其方法
        String str = "string";
        int length = str.length();
        System.out.println("字符串.length是其方法"+length);
    }
    public static void change(int[] arr) {
        arr[0] = 200;
    }
}
