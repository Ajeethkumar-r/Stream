package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapDemo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 =  list1.stream().map( n -> n+10 ).collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);

        // take multiple collections anf put it in one collection then the return type will :: collection< R = collections<R> >
        List<List<Integer>> finalList = Arrays.asList( lst1,lst2,lst3 );

        // flatmap taking the collection which holds the multipls colections and return stream of collection for each collections simply :: make stream for each collections ( stream of object )
        List<Integer> finalResult = finalList.stream().flatMap(x -> x.stream().map( a -> a+10 )).map(y -> y).collect(Collectors.toList());
        System.out.println(finalResult);
    }
}
