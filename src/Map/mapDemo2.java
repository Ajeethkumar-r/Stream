package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo2 {
    public static void main(String[] args) {
        List<String> bike = Arrays.asList("yamaha", "bajaj");
        List<String> bigbike = new ArrayList<>();


        // without stream
        // for( String name : bike ){
        //     System.out.println(name.length());
        // }

        bike.stream().map( b-> b.length() ).forEach(System.out :: println);
        bigbike = bike.stream().map( n -> String.valueOf(n.length())).collect(Collectors.toList());

        System.out.println(bigbike);
    }
}
