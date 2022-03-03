package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo3 {
    public static void main(String[] args) {
        List<String> checkNull = Arrays.asList("hi", null, "hello");
        List<String> filNull = new ArrayList<>();

        filNull = checkNull.stream().filter(c -> c!=null).collect(Collectors.toList());

        checkNull.stream().filter(c -> c!=null).forEach(System.out :: println);

        System.out.println(filNull);
    }
    
}
