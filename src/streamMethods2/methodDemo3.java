package streamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class methodDemo3 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("two","three");

        // findany()
        Optional<String> fa = list1.stream().findAny();
        System.out.println(fa.get());

        // if the list is empty then it will give us - NoSuchElementException
        List<Integer> list2 = Arrays.asList(); 
        // findFirst()
        Optional<Integer> ff = list2.stream().findFirst();
        System.out.println(ff.get());

    }
}
