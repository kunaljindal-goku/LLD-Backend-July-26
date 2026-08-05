package ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;

    public Consumer(Store store, Semaphore producerSema, Semaphore consumerSema) {
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
        this.store = store;
    }

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSema.acquire(); // try to do consumer--;
                store.removeItem();
                producerSema.release(); // prod++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
