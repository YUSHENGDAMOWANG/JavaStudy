public class helloworld {
    public static void main(String[] args) {
        // System.out.println("你好啊!朋友");
        System.out.println(test(1,5));
        System.out.println(test(11,1));

    }
        public static boolean test(int a,int b){

            boolean result = a > b ? true:false;
            return result;
        }

}
