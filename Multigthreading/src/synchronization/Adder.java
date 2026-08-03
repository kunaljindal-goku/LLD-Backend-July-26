package synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    private Value value;
    // private Lock lock;

    public Adder(Value value) {
        //  this.lock = lock;
        this.value = value;
    }

//    @Override
//    public Void call() throws Exception {
//        for(int i=1;i<=100;i++) {
//            lock.lock(); // TRY to acquire
//            this.value.setX(this.value.getX()+i);
//            System.out.println("Adder is adding: "+i);
//        }
//        return null;
//    }

//    public Void call() throws Exception {
//        for (int i = 1; i <= 100; i++) {
//            synchronized (value) {
//                this.value.setX(this.value.getX() + i);
//            }
//        }
//        return null;
//    }

    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            this.value.increment(i);
        }
        return null;
    }
}
