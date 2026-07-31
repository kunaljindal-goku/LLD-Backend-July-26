import java.util.concurrent.*;

public class ClientA {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        NumberMultiplier numberMultiplier = new NumberMultiplier(10);
        NumberMultiplier numberMultiplier1 = new NumberMultiplier(20);
        ExecutorService ex = Executors.newFixedThreadPool(2);

        // execute -> runnable
        // submit -> callables

        Future<Integer> future1 = ex.submit(numberMultiplier);
        Future<Integer> future2 = ex.submit(numberMultiplier);

        System.out.println("Hello");


        int val = future1.get(); // blocking call
        int val2 = future2.get();

        System.out.println(val);
    }
}
