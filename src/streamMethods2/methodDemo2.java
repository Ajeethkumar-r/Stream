package streamMethods2;

import java.util.ArrayList;
import java.util.List;

public class methodDemo2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        // anyMatch() if it matches with any of the value it return true or false 
        boolean fvalue = fruits.stream().anyMatch(v-> v.startsWith("a"));
        System.out.println(fvalue);

        // allMatch() if it match with all the value it return true or false
        boolean fvalue2 = fruits.stream().allMatch(v-> v.startsWith("a"));
        System.out.println(fvalue2);

        // noneMatch() if it doesnot match with all value it return true or flase
        boolean fvalue3 = fruits.stream().noneMatch(v-> v.startsWith("a"));
        System.out.println(fvalue3);

        

    }
}
