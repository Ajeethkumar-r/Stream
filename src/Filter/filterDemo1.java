package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo1 {
    public static void main(String[] args) throws Exception {
        // ArrayList<Integer> numberList = new ArrayList<Integer>();
        // numberList.add(10);
        // numberList.add(15);
        // numberList.add(20);
        // numberList.add(25);

        List<Integer> numbers = Arrays.asList(10,15,20,25,30); 
        List<Integer> evenNumbers = new ArrayList<Integer>();

        // without stream 
        // for ( int i : numbers ){
        //     if( i % 2 == 0 ){
        //         evenNumbers.add(i);
        //     }
        // }
        
        // with stream 
        evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        
       numbers.stream().filter(n -> n % 2 == 0).forEach(System.out :: println);

    }
}
