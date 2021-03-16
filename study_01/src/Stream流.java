import java.util.ArrayList;
    //拼接流式模型
public class Stream流 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("张三疯");
        array.add("李四");
        array.add("王五");
        array.add("张麻");
        array.add("张六七");

        array.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}
