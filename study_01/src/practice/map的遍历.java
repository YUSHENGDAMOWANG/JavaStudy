package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class map的遍历 {
    public static void main(String[] args) {
        HashMap<String, String> map = new LinkedHashMap<>();
        map.put("张三","zhang");
        map.put("李四","li");
        map.put("王五","wang");
        map.put("赵六","zhao");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(value);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+"---value:"+value);
        }
    }
}
