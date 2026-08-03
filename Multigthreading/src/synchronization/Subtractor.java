package synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    private Value value;
  //  private Lock lock;

    public Subtractor(Value value) {
      //  this.lock = lock;
        this.value = value;
    }

//    @Override
//    public Void call() throws Exception {
//        for(int i=1;i<=100;i++) {
//            lock.lock();
//            this.value.setX(this.value.getX()-i);
//            System.out.println("Subtractor is subtracting: "+i);
//            lock.unlock();
//        }
//        return null;
//    }

//    public Void call() throws Exception {
//        for (int i = 1; i <= 100; i++) {
//            synchronized (value) {
//                this.value.setX(this.value.getX() - i);
//                }
//            }
//        return null;
//    }

    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
           this.value.decrement(i);
        }
        return null;
    }
}

