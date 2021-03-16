import java.util.*;
import java.util.Iterator;
import java.util.stream.Collectors;

public class switchTest {
    public static void main(String[] args) {

        Set<Integer> all = new HashSet<>();
        /*
        * 双色球投注区分为红色球号码区和蓝色球号码区，
        * 红色球号码区由1-33共三十三个号码组成，
        * 蓝色球号码区由1-16共十六个号码组成。
        * 投注时选择6个红色球号码和1个蓝色球号码组成一注进行单式投注，
        * 每注金额人民币2元。
        *
        * */
        int size = all.size();
        Random r = new Random();
        while (size ==  6){

        int red = r.nextInt(33)+1;
        all.add(red);

    }
        System.out.println(all.size());
        /*if (all.size() <=7 ){
            int blue = r.nextInt(16)+1;
            all.add(blue);
        }*/


        Iterator<Integer> it = all.iterator();
        while (it.hasNext()) {
            for (int i = 1; i < 8; i++) {
                System.out.println("第"+i+"个球号码为"+it.next());
            }

        }



    }
}
