package streamMethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class methodDemo1 {
    public static void main(String[] args) {
        // numbers
        List<Integer> list1 = Arrays.asList(1,3,4,6,5,9,8,0);
        // sort() ascending
        List<Integer> list2 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

        // sort() descending  with help of comparator and reverse_order
        List<Integer> revList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(revList);

        // string
        List<String> stringList = Arrays.asList("ajeeth", "ranjith", "bravo", "starc");

        // ascending
        List<String> sList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sList);

        // descending
        List<String> sList2 = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sList2);
    }
}
