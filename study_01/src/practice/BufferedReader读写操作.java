package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class BufferedReader读写操作 {
    public static void main(String[] args) throws Exception{
        java.io.BufferedReader br = new java.io.BufferedReader(new FileReader("F:\\java project\\学习\\test.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));

        HashMap<String, String> map = new HashMap<>();
        String line = null;
        //byte [] read = new byte[1024];
        while((line =br.readLine()) != null){
            //System.out.println(line);
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        Set<Map.Entry<String, String>> all = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = all.iterator();
        while(iterator.hasNext()){
            String key = iterator.next().getKey();
            //System.out.println(key);
            String text = map.get(key);
            //System.out.println(text);
            bw.write(key);
            bw.write(".");
            bw.write(text);
            bw.write("\r\n");
        }
        bw.flush();
        bw.close();
    }
}
