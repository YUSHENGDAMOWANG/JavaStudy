package practice;

public class 外部类名内部类名 {


    public static void main(String[] args) {
        //person person = new person();//？？？
        //practice.person.Heart heart = person.new Heart();

        //外部类名.内部类名 对象名 = new 外部类型().new 内部类型()；
        内部类.Heart h = new 内部类().new Heart();
    }
}
