package StreamsAdvanced;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(new Electronics("E1", "Laptop", 55000, 5, 24));
        itemsList1.add(new Electronics("E2", "Mobile Phone", 22000, 8, 12));
        itemsList1.add(new Electronics("E3", "Earphones", 1500, 0, 6));
        itemsList1.add(new Book("B1", "Java", 799, 10, "James Gosling"));
        itemsList1.add(new Clothing("C1", "T-Shirt", 499, 20, "M"));
    }
}
