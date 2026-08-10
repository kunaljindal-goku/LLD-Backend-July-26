import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private LinkedList<Item> items;
    private Integer MAX_SIZE = 10;

    public RecentlyViewedItems() {
        items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        // remove the item if it is already present, so it can be moved to the front
        items.remove(item);

        items.addFirst(item);
        if (items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }

    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(items);
    }
}