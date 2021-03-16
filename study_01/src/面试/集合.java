package 面试;

import java.util.*;

public class 集合 {
    //集合分别实现collection和map接口
    /*
    * collection:list set
    * list:ArrayList（数组，线程不安全，查找快，增删慢）、
    *      LinkedList（双向链表，增删快，查找慢）、
    *      Vector（数组，线程安全，效率低）
    *      有序，有索引,可以重复
    * set:TreeSet、HashSet、LinkedHashSet
    *
    *
    * map:TreeMap、HashMap、LinkedHashMap
    * */

    public static void main(String[] args) {
        //有序
        List<String> list1 = new ArrayList<>();
        //有序
        List<String> list2 = new LinkedList<>();
        //有序
        List<String> list3 = new Vector<>();
        list1.add("zhangsan");
        list1.add("lisi");
        list1.add("wangwu");
        list1.add("wangwu");
        list1.add("zhaoliu");

        list2.add("zhangsan");
        list2.add("lisi");
        list2.add("wangwu");
        list2.add("zhaoliu");

        list3.add("zhangsan");
        list3.add("lisi");
        list3.add("wangwu");
        list3.add("zhaoliu");
        //ArrayList
        for (String l1 : list1) {
            System.out.println(l1);
        }
        System.out.println("========");
        //LinkedList
        for (String l2 : list2) {
            System.out.println(l2);
        }
        System.out.println("========");
        //Vector
        for (String l3 : list3) {
            System.out.println(l3);
        }

        //TreeSet、HashSet、LinkedHashSet
        //无序
        Set<String> set1 = new TreeSet<>();
        //无序
        Set<String> set2 = new HashSet<>();
        //有序
        Set<String> set3 = new LinkedHashSet<>();
        set1.add("zhangsan");
        set1.add("lisi");
        set1.add("lisi");
        set1.add("wangwu");
        set1.add("zhaoliu");

        set2.add("zhangsan");
        set2.add("lisi");
        set2.add("wangwu");
        set2.add("zhaoliu");

        set3.add("zhangsan");
        set3.add("lisi");
        set3.add("wangwu");
        set3.add("zhaoliu");


        Iterator<String> it1 = set1.iterator();
        Iterator<String> it2 = set2.iterator();
        Iterator<String> it3 = set3.iterator();

        Object[] arr = new Object[10];

        System.out.println("=======");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("=======");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("=======");
        int i = 0;
        while(it3.hasNext()){
            System.out.println(it3.next());
            arr[i] = it3.next();
            i++;
        }
    }
}
