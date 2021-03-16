package Lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {
    public static void main(String[] args) {
        Person [] arr = {
            new Person("张三",18),
            new Person("李四",13),
            new Person("王五",28),
            new Person("赵六",15)
        };

        //  常规方式 前面-后面即为升序
      /*  Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Arrays.sort(arr,(Person o1, Person o2) ->{
            return o1.getAge()-o2.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
