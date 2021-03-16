package practice;

import java.util.Properties;
import java.util.Set;

public class 配置文件设置 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("name","张三");
        p.setProperty("age", String.valueOf(18));

        System.out.println(p);
        String name = p.getProperty("name");
        String age = p.getProperty("age");
        System.out.println("name:"+name+"   age:"+age);

        Set<String> str = p.stringPropertyNames();
        for (String s : str) {
            System.out.println(s+p.getProperty(s));
        }
    }
}
