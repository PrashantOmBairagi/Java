package StreamAPI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Streams Basically are used to shorten the code palette.
// Streams are used to perform bulk operations and process objects of Collections/ group of objects like List or ArrayList.

public class StreamBegin {
    static void main() {
        List<Integer> list = List.of(3,24,40,30,5,8,6,9,58);
        Stream<Integer> stream = list.stream();
        // that i -> i%2 == 0; is an LAMBDA EXPRESSION, used for Functional Interfaces (interface with only one abstract method).
        List<Integer> evenList = stream.filter(i -> i%2 ==0).collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer> above20 = list.stream().filter(i -> i>20).collect(Collectors.toList());
        System.out.println(above20);


        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        System.out.println(list.stream().limit(2).collect(Collectors.toList()));


    }
}
