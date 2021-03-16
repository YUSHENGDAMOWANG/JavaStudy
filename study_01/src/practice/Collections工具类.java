package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Collections工具类 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"abc","cbd","ddd","bcc");
        Collections.sort(list, new Comparator<String>() {
            @Override
            //升序排序
            /*public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }*/
            //降序排序
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });
        System.out.println(list);
    }
}
