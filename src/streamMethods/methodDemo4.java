package streamMethods;

import java.util.Arrays;
import java.util.List;

public class methodDemo4 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");
        // toArray() return an object,  converts the list to Array pg object
        Object arr[] =  stringList.stream().toArray();

        System.out.println(arr.length);

        for( Object vlaue : arr ){
            System.out.println(vlaue);
        }
    }
}
