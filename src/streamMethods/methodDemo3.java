package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class methodDemo3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");

        // reduce() -> combine the list of values or objects in one element or obejct and this is also give us a stream
        Optional<String> reduced = stringList.stream().reduce( ( value, combinedValue ) -> {return value + combinedValue;} );
        System.out.println(reduced.get());


        // reduce picks 0 as intialvalue and using sum it iterates through the list do sum functionality and since this all are integer we mantion the class as (Integer :: sum )
        List<Integer> numberlist = Arrays.asList(1,2,3,4,5);
        Integer sum = numberlist.stream().reduce(0, Integer :: sum);
        System.out.println(sum);
    }
}
