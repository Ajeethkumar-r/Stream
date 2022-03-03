package streamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class methodDemo4 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3);
        List<String> alpha = Arrays.asList("A","B","C");

        Stream<Integer> s1 = num.stream();
        Stream<String> s2 = alpha.stream();

        List<Object> fs = Stream.concat(s1, s2).collect(Collectors.toList());

        System.out.println(fs);
    }
}
