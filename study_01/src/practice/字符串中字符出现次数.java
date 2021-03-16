package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 字符串中字符出现次数 {
    public static void main(String[] args) {
        System.out.println("请输入要查询的字符串：");
        findString(new Scanner(System.in).nextLine());
        //findChar(new Scanner(System.in).nextLine());
    }

    private static void findString(String nextLine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int num = 0; num < nextLine.length(); num++) {
            char c = nextLine.charAt(num);
            //不存在 首次放进map
            if(!map.containsKey(c)){
                map.put(c,1);
            }else {
                //已经存在 获取当前key的value
                Integer integer = map.get(c);
                integer+=1;
                //map.put(c,++integer);
                map.put(c,integer);
            }
        }
        System.out.println(map);
    }
    private static void findChar(String line) {
        //1:创建一个集合 存储  字符 以及其出现的次数
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //2:遍历字符串
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            //判断 该字符 是否在键集中
            if (!map.containsKey(c)) {//说明这个字符没有出现过
                //那就是第一次
                map.put(c, 1);
            } else {
                //先获取之前的次数
                Integer count = map.get(c);
                //count++;
                //再次存入  更新
                map.put(c, ++count);
            }
        }
        System.out.println(map);
    }
}
