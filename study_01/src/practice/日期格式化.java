package practice;

import java.util.Vector;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 日期格式化 {
    public static void main(String[] args) {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String f = sd.format(date);
        System.out.println(f);
    }
}
