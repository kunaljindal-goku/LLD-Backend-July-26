public class NumberPrinter implements Runnable{

    void print() throws InterruptedException {
        for(int i=0;i<100;i++) {
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        try {
            print();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
