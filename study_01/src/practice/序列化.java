package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class 序列化 {
    public static void main(String[] args) throws Exception {
        student s1 = new student("张三", 23);
        student s2 = new student("李四", 25);
        student s3 = new student("王五", 18);

        ArrayList<student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //System.out.println(list);

        //序列化操作
        //serializ(list);

        //反序列化
        ObjectInputStream o = new ObjectInputStream(new FileInputStream("F:\\java project\\学习\\object.txt"));
        // 读取对象,强转为ArrayList类型
        ArrayList<student> obj = (ArrayList<student>)o.readObject();
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i).getName()+"  "+obj.get(i).getAge());
        }
    }

    private static void serializ(ArrayList<student> list) throws Exception{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("object.bat"));
        os.writeObject(list);
        os.close();
    }
}
