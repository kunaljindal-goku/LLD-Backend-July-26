package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(maxSize);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public synchronized void addItem(Object item) {
        if(this.items.size() < maxSize) {
            items.add(item);
            System.out.println("Producer has added an item. Size of items: "+items.size());
        }
    }

    public synchronized void removeItem() {
        if(items.size() > 0) {
            items.remove(items.size()-1);
            System.out.println("Consumer has consume. Size of items: "+items.size());
        }
    }
}
