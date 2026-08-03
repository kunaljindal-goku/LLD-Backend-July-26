package synchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value(0);

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<Void> adderFuture = ex.submit(adder);
        Future<Void> subtractFuture = ex.submit(subtractor);

        adderFuture.get();
        subtractFuture.get();

        System.out.println(value.getX());

        ex.shutdown();

    }
}
