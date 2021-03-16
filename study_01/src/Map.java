import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三",15);
        map.put("李四",17);
        map.put("王五",18);
        System.out.println(map);
        Set<String> key = map.keySet();
        Iterator<String> iterator = key.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            Integer age = map.get(next);

            System.out.println("姓名："+next+"   "+"年龄："+age);
        }
        System.out.println("=============================");
        for (String s:
             key) {
            Integer age = map.get(s);
            System.out.println("姓名："+s+"   "+"年龄："+age);
        }
        System.out.println("=============================");
        for (String s:
             map.keySet()) {
            System.out.println("姓名："+s+"   "+"年龄："+map.get(s));
        }

        System.out.println("=============================");
        Set<java.util.Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<java.util.Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            java.util.Map.Entry<String, Integer> next = iterator1.next();
            String key1 = next.getKey();
            Integer value = next.getValue();
            System.out.println("姓名："+key1+"   "+"年龄："+value);
        }
        System.out.println("=============================");
        for (java.util.Map.Entry<String,Integer> entry:
                entries) {
            String key1 = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("姓名："+key1+"   "+"年龄："+value);
        }
        System.out.println("=============================");


    }
}
