package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClientX {

    public static void main(String[] args) {

      //  List<Integer> l = Arrays.asList(1,3,2,4,5,6);

//         Stream s = l.stream()
//                .map(x -> {
//                    System.out.println("Mapping x = "+x);
//                    return x*x;
//                });
//
//        System.out.println("DONE");
//
//        System.out.println(s.toList());

        List<Integer> l = Arrays.asList(1,3,4,6,5,7,2);
        Optional<Integer> optionalInteger = l.stream()
                .sorted()
                .filter(x -> {
                    System.out.println("Checking x = "+x);
                    return x%2==0;
                })
                .findFirst();

        System.out.println(optionalInteger.get());
    }
}
