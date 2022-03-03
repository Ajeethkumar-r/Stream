package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class methodDemo1{
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bike", "bus", "car");   

        // distinct removes duplicate
        List<String> dVehicles = vehicles.stream().distinct().collect(Collectors.toList());
        System.out.println(dVehicles);

        // forEach
        vehicles.stream().distinct().forEach(System.out :: println);

        // Count method gives Long type data
        long count = vehicles.stream().distinct().count();
        System.out.println(count);

        // Limit works with maximium value we provide in it and return objects respectively
       List<String> lVehList = vehicles.stream().distinct().limit(2).collect(Collectors.toList());
       System.out.println("Limited vehicles: " + lVehList);

        // forEach with limit
       vehicles.stream().distinct().limit(2).forEach(System.out :: println);
    }
}