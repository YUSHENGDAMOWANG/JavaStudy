import jdk.nashorn.internal.ir.CallNode;
import org.junit.Test;

import java.util.*;

public class Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("刘备");

        java.util.Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======================");

        for (String str:
             coll) {
            System.out.println(str);
        }
    }

    @Test
    public void test(){

        //无序的
        Set set = new HashSet();
        set.add("张三");
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("网吧");

        java.util.Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        //有序的
        Set linkedset = new LinkedHashSet();
        linkedset.add("张三");
        linkedset.add("张三");
        linkedset.add("李四");
        linkedset.add("王五");
        linkedset.add("王八");

        java.util.Iterator it2 = linkedset.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println(set.equals(linkedset));
        System.out.println(set == linkedset);

    }
}
