import java.util.HashSet;
import java.util.Set;

public class Wishlist {
    private Set<Item> items;

    public Wishlist() {
        items = new HashSet<>();
    }

    public void addToWishlist(Item item) {
        items.add(item);
    }

    public void removeFromWishlist(Item item) {
        items.remove(item);
    }

    public Set<Item> getWishlist() {
        return items;
    }
}