package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int id;
    char grade;

    public Student( String name, int id, char grade ){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

public class flatMapDemo3 {
    public static void main(String[] args) {
        List<Student> list1 = Arrays.asList( new Student("john", 1, 'A'),
        new Student("rock", 2, 'B')
         );
        List<Student> list2 = Arrays.asList( new Student("roman", 3, 'A'),
        new Student("shawn", 4, 'B')
         );

       List<List<Student>> tbl = Arrays.asList(list1,list2);

       List<String> value = tbl.stream().flatMap(f -> f.stream()).map(n -> n.name).collect(Collectors.toList());
       System.out.println(value);
    }
}
