import java.util.Collections;

public class Item implements Comparable<Item> {

    private String id;
    private String name;
    private int quantity;
    private double price;

    public Item(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // this and other object
    // if you want 'this' to come first, return -ve value
    // if you want other to come first, retrn +ve value
    // else return 0

    // sort based on price in asc
//    @Override
//    public int compareTo(Item other) {
////        if(this.price < other.price) return -1;
////        if(this.price > other.price) return 1;
////        if(this.quantity < other.quantity) return 1;
////        if(this.quantity > other.quantity) return -1;
////        return 0;
//
//        if(this.price!=other.price) {
//            return Double.compare(this.price, other.price);
//        }
//        else return other.quantity - this.quantity;
//
//        //return Double.compare(this.price, other.getPrice());
//    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Item o) {
        return this.name.compareTo(o.name);  // -ve if this is lexi smaller, +ve for other, else 0
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
