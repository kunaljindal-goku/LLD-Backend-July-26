import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {
    // descending order of quantity — larger quantity comes first
    @Override
    public int compare(Item o1, Item o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}