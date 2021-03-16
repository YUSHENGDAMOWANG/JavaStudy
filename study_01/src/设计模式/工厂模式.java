package 设计模式;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class 工厂模式 {
    public static void main(String[] args) throws Exception {
        Animal a = createAnimal();
        a.eat();
    }

    static Animal createAnimal() throws Exception {
        FileReader fr = new FileReader("F:\\java project\\学习\\study_01\\src\\设计模式\\config.txt");
        BufferedReader in = new BufferedReader(fr);
        String str = in.readLine();
        in.close();
        String [] ss = str.split("=");
        String className = ss[1].trim();

        Class c = Class.forName(className);
        Object o = c.newInstance();
        //System.out.println(o);

        return (Animal) o;
    }

    abstract class Animal{
        public abstract void eat();
    }
    class Dog extends Animal{
        @Override
        public void eat() {
            System.out.println("DOG EAT");
        }
    }
    class Cat extends Animal{
        @Override
        public void eat() {
            System.out.println("CAT EAT");
        }
    }
    class Tiger extends Animal{
        @Override
        public void eat() {
            System.out.println("TIGER EAT");
        }
    }
    @Test
    public void show(){
        Class<?> a = Dog.class.getDeclaringClass();
        System.out.println(a);
    }

}

