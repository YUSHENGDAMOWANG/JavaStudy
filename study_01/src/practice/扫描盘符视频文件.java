package practice;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

public class 扫描盘符视频文件 {
    public static void main(String[] args) throws Exception{
        System.out.println("请输入要查询视频的磁盘名称：");
        String path = new Scanner(System.in).nextLine();
        // 创建File对象
        File dir = new File(path);
        // 调用打印目录方法
        printDir(dir);

    }

    public static void printDir(File dir) throws Exception {
        // 获取子文件和目录
        File[] files = dir.listFiles();
        HashSet<String> str = new HashSet<>();
        FileOutputStream fos = new FileOutputStream("movie.txt");
        Collections.addAll(str, "mp4", "avi", "mov", "mpg", "mpeg", "mpe",
                "dat", "vob", "asf", "3gp", "wmv", "asf",
                "rm", "rmvb", "flv", "mkv",
                "MP4", "AVI", "MOV", "MPG", "MPEG", "MPE",
                "DAT", "VOB", "ASF", "3GP", "WMV", "ASF",
                "RM", "RMVB", "FLV", "MKV");

        // 循环打印
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    //System.out.println(split[1]);
                    String[] name = file.getName().trim().split("\\.");
                    // 是文件，判断文件名并输出文件绝对路径
                    for (int i = 0; i < name.length; i++) {
                        if (str.contains(name[i])) {

                            //fos.write("文件名：".getBytes());

                            fos.write(file.getAbsolutePath().getBytes());
                        }
                    }
                } else {
                    // 是目录，继续遍历,形成递归
                    printDir(file);
                }
            }
        }
        fos.close();
    }
}
