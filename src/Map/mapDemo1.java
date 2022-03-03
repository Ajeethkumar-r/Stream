package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo1 {
    public static void main(String[] args) {
        List<String> bike = Arrays.asList("yamaha", "bajaj");
        List<String> bigbike = new ArrayList<>();

        // without stream 
        // for ( String b : bike ){
        //     bigbike.add(b.toUpperCase());
        // }

        bigbike = bike.stream().map(b -> b.toUpperCase()).collect(Collectors.toList());

        System.out.println(bigbike);
    }
}
