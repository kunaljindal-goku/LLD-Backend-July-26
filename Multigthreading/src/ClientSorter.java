import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ClientSorter {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(10);
        arr.add(4);

        ExecutorService ex = Executors.newFixedThreadPool(arr.size());
        ExecutorService ex1 = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arr,ex);

        Future<List<Integer>> future = ex.submit(sorter);

        System.out.println(future.get());
    }
}
