package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ajeeth","aje","ranjith", "ranji" );
        List<String> newNames = new ArrayList<>();
        newNames = names.stream().filter( str -> str.length() > 3 && str.length() < 9 ).collect(Collectors.toList());
        System.out.println(newNames);

        names.stream().filter( str-> str.length()>3 && str.length()<9 ).forEach(System.out :: println);
    }
}
