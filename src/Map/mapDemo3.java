package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo3 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        List<Integer> mulNum = new ArrayList<>();

        for( int i : numberList ){
            System.out.println(i*3);
        }

        numberList.stream().map( m -> m*3 ).forEach(System.out :: println);

        mulNum = numberList.stream().map( m -> m *5 ).collect(Collectors.toList());
        System.out.println(mulNum);
    }
}
