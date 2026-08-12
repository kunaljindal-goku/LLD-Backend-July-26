package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

      //  List<Integer> arr = Arrays.asList(3, 2, 1, 5, 4, 2, 1, 4, 3);

        // Step 1 - convert to stream
//        List<Integer> l = arr.stream()
//                .map(x -> x * x)
//                .distinct()
//                .toList();
//
//        System.out.println(l);
//
//        arr.stream()
//                .map(x -> x * x)
//                .distinct()
//                .sorted((a,b) -> b-a)
//                .forEach(x -> System.out.println(x));

        List<Double> arr = Arrays.asList(1.0,3.0,5.0,4.0);

        Optional<Double> optional = arr.stream()
                .filter(x -> x %2==0)
                .map(x -> x * x)
                .distinct()
                .sorted((a,b) -> Double.compare(b,a))
                .findFirst();


        if(optional.isEmpty())
        {
            System.out.println("Integer not available");
            return;
        }
        System.out.println(optional.get());
    }
}
