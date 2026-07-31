import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String args[]) throws InterruptedException {
        System.out.println("hello");

//        NumberPrinter numberPrinter = new NumberPrinter();
//       Thread t = new Thread(numberPrinter);
//       t.start();

        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService ex = Executors.newFixedThreadPool(cores);

//        for(int i=1;i<=1000000;i++) {
//            IndividualNumberPrinter inp = new IndividualNumberPrinter(i);
//            Thread t = new Thread(inp);
//            t.start();
//        }

        for(int i=1;i<=1000000;i++) {
            IndividualNumberPrinter inp = new IndividualNumberPrinter(i);
            if(i==500000) {
                System.out.println("DEBUG");
            }
            ex.execute(inp);
        }

        ex.shutdown();

        System.out.println("Hello");
    }
}
