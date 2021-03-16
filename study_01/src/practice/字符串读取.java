package practice;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class 字符串读取 {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(file);
        while(true){
            System.out.println("请输入要输入的字符串：");
            fos.write(new Scanner(System.in).nextLine().getBytes());
            fos.write("\r\n".getBytes());
        }
    }

    @Test
    public void read() throws Exception{
        FileInputStream fis = new FileInputStream("F:\\java project\\学习\\test.txt");
        int read;
        byte [] len = new byte[1024];
        while((read = fis.read(len)) != -1){
            System.out.println(new String(len,0,read));
        }
    }
}
