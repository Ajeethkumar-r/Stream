package FilMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    int salary;

    public Employee( int id, String name, int salary ){
        this.id = id;
        this.name = name;
        this.salary= salary;
    }
}

public class filMapDemo {

    public static void main(String[] args) {
        
  
    List<Employee> employeesList = Arrays.asList(
        new Employee(1, "joker", 50000), 
        new Employee(2, "villian", 100000), 
        new Employee(3, "Hero", 150000)
        ); 

    List<Integer> emp = new ArrayList<>();
    
    emp = employeesList.stream().filter(e -> e.salary > 50000).map(e ->  e.salary ).collect(Collectors.toList());
    
    System.out.println(emp);
    }
}
