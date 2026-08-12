import java.lang.management.OperatingSystemMXBean;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class Client {

    public static void main(String[] args) {
//       Task task = new Task();
//       Thread t = new Thread(task);
//       t.start();
//
//        Runnable task = () -> {
//            System.out.println("Hello World");
//        };
//
//        Thread t = new Thread(task);
//        t.start();

        List<Integer> l = Arrays.asList(2,4,-3,-5,1); //1,2,-3,4,-5
        Collections.sort(l, (x,y) -> y*y - x*x);

        System.out.println(l);

        Calculator adder = (a,b,c) -> a+b+c;

        System.out.println(adder.calculate(3,4,5));




    }
}
