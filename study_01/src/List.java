import java.util.ArrayList;
import java.util.Iterator;

public class List {
    /*
    * java.util.list接口extends Collection接口
    * list 的特点：
    *       ·1 有序的集合 存储元素和取出元素的顺序都是一致的
    *        2 有索引 包含一些带索引的方法
    *        3 允许重复的元素
    * add
    * get
    * remove
    * set
    *
    * */

    public static void main(String[] args) {
        java.util.List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        System.out.println(list);

        list.add(2,"zt");
        System.out.println(list);
        System.out.println("=========一般遍历============");
        for (int i = 0; i < list.size() ; i++) {
            String s = list.get(i);
            System.out.println("第"+i+"个元素为"+s);
        }
        System.out.println("=========迭代器遍历============");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=========增强for遍历============");
        for (String s:
             list) {
            System.out.println(s);
        }
    }
}
