import java.util.*;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(T item) {
        if (item.getQuantity() < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        }
        if (items.containsKey(item.getId())) {
            throw new RuntimeException("Item " + item.getId() + " already exists");
        }
        items.put(item.getId(), item);
    }

    public void removeItem(String id) {
        items.remove(id);
    }

    public T getItem(String id) {
        return items.get(id);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    }
}