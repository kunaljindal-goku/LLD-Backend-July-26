public class IndividualNumberPrinter implements Runnable{

    int num;

    public IndividualNumberPrinter(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("num = "+num + " Thread = "+ Thread.currentThread().getName());
    }
}
