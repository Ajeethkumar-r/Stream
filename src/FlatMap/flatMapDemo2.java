package FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapDemo2 {
    public static void main(String[] args) {
        List<String> teamA  =Arrays.asList( "a","b","c" );
        List<String> teamB  =Arrays.asList( "d","e","f" );
        List<String> teamC  =Arrays.asList( "g","h","i" );

        List<List<String>> players = new ArrayList<>();

        players.add(teamA);
        players.add(teamB);
        players.add(teamC);

       //wihtout stream  
        // for ( List<String> team : players ){
        //     for (String  value : team ){
        //         System.out.println(value);
        //     }
        // }

        List<String> v = players.stream().flatMap( q -> q.stream().map(u -> u+" hi") ).collect(Collectors.toList());

        System.out.println(v);

    }
}
