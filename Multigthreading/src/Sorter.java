import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> list;
    private ExecutorService executorService;

    public Sorter(List<Integer> list,
                  ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(list.size()==1) return list;

        int mid = list.size()/2;
        List<Integer> leftHalf = list.subList(0,mid);
        List<Integer>  rightHalf = list.subList(mid,list.size());

        Sorter leftSorter = new Sorter(leftHalf,executorService);
        Sorter rightSorter = new Sorter(rightHalf,executorService);

        Future<List<Integer>> leftFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightFuture = executorService.submit(rightSorter);

        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();

       return merge(leftSorted,rightSorted);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i=0, j=0;
        while(i < left.size() && j < right.size()) {
            if(left.get(i) <= right.get(j)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while(i < left.size()) merged.add(left.get(i++));
        while(j < right.size()) merged.add(right.get(j++));

        return merged;
    }
}
