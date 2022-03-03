package parallelStream;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
}

public class parallelDemo1 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student( "rock", 90 ),
            new Student( "john", 93 ),
            new Student( "batista", 85 ),
            new Student( "kane", 75 ),
            new Student( "cmpunk", 70)
        );

        // sequentialStream
       studentList.stream().filter( v -> v.score >= 90 ).limit(3).forEach(v ->  System.out.println("squential: "+v.getName()));

        // parallelStream
       studentList.parallelStream().filter( v -> v.score >= 70 ).forEach(v ->  System.out.println("parallel: "+v.getName()));

        // convert - sequentialStream to parallel
        studentList.stream().parallel().filter( v -> v.score >= 90 ).limit(3).forEach(v ->  System.out.println("squential to parallel: "+v.getName()));

    }
}
