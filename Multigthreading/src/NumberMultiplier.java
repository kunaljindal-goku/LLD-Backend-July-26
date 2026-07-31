import java.util.concurrent.Callable;

public class NumberMultiplier implements Callable<Integer> {

    private int val;

    public NumberMultiplier(int val) {
        this.val = val;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        return val*5;
    }
}
