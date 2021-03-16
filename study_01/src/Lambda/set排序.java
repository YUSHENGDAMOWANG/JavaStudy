package Lambda;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class set排序 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(9);
        set.add(5);
        //传统方法
        TreeSet<Integer> sortedSet2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            //前面减去后面升序
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        sortedSet2.addAll(set);
        System.out.println(sortedSet2);
        System.out.println("==============");
        TreeSet<Integer> sortedSet3 = new TreeSet<>((o1,o2)->o1-o2);
        sortedSet3.addAll(set);
        System.out.println(sortedSet3);
        System.out.println("==============");
        //TreeSet是SortedSet接口的唯一实现类 支持自然排序和定制排序
        Set<Integer> sortedSet = new TreeSet<>(Comparator.naturalOrder());
        sortedSet.addAll(set);
        System.out.println(sortedSet);
        System.out.println("=========================");
        //stream
        Set newSet = set.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toSet());
        TreeSet<Integer> newSort = new TreeSet<>();
        newSort.addAll(newSet);
        System.out.println(newSort);

    }
}
