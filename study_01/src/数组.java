public class 数组<arrc> {

    //动态数组： 数据类型 [] 数组名称 =new 数据类型[数组长度];
    /*
    * 数组是指一种引用数据类型
    *
    * 动态初始化： 创建数组的时候 直接指定数组当中的数据元素的个数
    * 静态初始化：创建数组的时候 不直接指定数据的个数 而是直接将数据内容指定
    * */
    int [] arrayA = new int [300];

    //标准格式
    int [] arrayB =new int []{2,2,1,4};

    String [ ] arrrayC = new String[]{"hello","aworls","java"};

    //省略格式
    int [] arr ={1,2,3};
    int [] arrcc = new int[2];

    public static void main(String[] args) {
        int [] arrayB =new int []{2,2,1,4};
        for(int i=0;i<=arrayB.length;i++){
            System.out.println(arrayB[i]);


        }

    }
}
