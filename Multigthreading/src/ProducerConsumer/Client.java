package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        Store store = new Store(10);

        // 10 producers
        // 15 consumers

        ExecutorService ex = Executors.newCachedThreadPool();

        for(int i=0;i<10;i++) {
            Producer p = new Producer(store);
            ex.execute(p);
        }

        for(int i=0;i<15;i++) {
            Consumer c = new Consumer(store);
            ex.execute(c);
        }
    }
}
