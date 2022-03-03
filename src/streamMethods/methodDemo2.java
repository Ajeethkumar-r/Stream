package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class methodDemo2 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // count()
       long evenNumbers = numberList.stream().filter( n -> n%2 == 0 ).count();
       System.out.println(evenNumbers);

        //  min()
       Optional<Integer> minv = numberList.stream().min(( v1,v2 ) -> v1.compareTo(v2));

       System.out.println(minv.get());
        // max()
       Optional<Integer> maxv = numberList.stream().max(( v1,v2 ) -> v1.compareTo(v2));

       System.out.println(maxv.get());
    }
}
