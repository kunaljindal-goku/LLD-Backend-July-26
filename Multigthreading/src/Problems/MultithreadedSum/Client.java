package Problems.MultithreadedSum;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // ---- Sample data (1 million numbers) ----
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            arr.add(i);
        }

        // ---- Step 1: find available cores ----
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available cores: " + cores);

        // ---- Step 2: create thread pool ----
        ExecutorService executor = Executors.newFixedThreadPool(cores);

        // ---- Step 3: divide array into chunks ----
        int chunkSize = arr.size() / cores;

        Future<Long>[] futures = new Future[cores];

        // ---- Step 4: submit tasks ----
        for (int i = 0; i < cores; i++) {

            int start = i * chunkSize;

            // last chunk handles remainder elements
            int end = (i == cores - 1) ? arr.size()
                    : (i + 1) * chunkSize;

            SumMultiThreaded task =
                    new SumMultiThreaded(arr, start, end);

            futures[i] = executor.submit(task);
        }

        // ---- Step 5: collect results using get() ----
        long totalSum = 0L;

        for (int i = 0; i < cores; i++) {
            totalSum += futures[i].get(); // waits if needed
        }

        System.out.println("Total Sum = " + totalSum);

        executor.shutdown();
    }
}
