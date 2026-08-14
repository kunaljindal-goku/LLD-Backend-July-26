package StreamsAdvanced;

import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Electronics("E1", "Laptop", 55000, 5, 24));
        items.add(new Electronics("E2", "Mobile Phone", 22000, 8, 12));
        items.add(new Electronics("E3", "Earphones", 1500, 10, 6));
        items.add(new Book("B1", "Java", 799, 10, "James Gosling"));
        items.add(new Clothing("C1", "T-Shirt", 499, 20, "M"));

        // 1a. Print all item IDs
//        items.stream()
//                .map(s -> s.getId())
//                .forEach(s -> System.out.println(s));
//
//        // 1b. List of item names, lowercase
//        items.stream()
//                .map(s -> s.getName().toLowerCase())
//                .forEach(s -> System.out.println(s));

        // Task 2: Filtering and Matching

        // 2a. Items priced above 1000 — print names
//        items.stream()
//                .filter(s -> s.getPrice() > 1000)
//                .forEach(s -> System.out.println(s.getName()));

        // 2b. Is any item out of stock?
//        boolean ans = items.stream()
//                .anyMatch(s -> s.getQuantity() <= 0);
//        System.out.println(ans);

       // 2c. Confirm no item has a negative quantity
//        boolean ans2 = items.stream()
//                .noneMatch(s -> s.getQuantity() < 0);
//        System.out.println(ans2);
//
//        boolean ans3 = items.stream()
//                .allMatch(s -> s.getQuantity() > 0);
//        System.out.println(ans3);
//
//        // 2d. How many items are priced above 1000?
//        long count = items.stream().filter(s -> s.getPrice() > 1000)
//                .count();
//
//        System.out.println(count);

        // Task 3: Combined Stream Operations
        // In a single stream pipeline: filter items priced above 1000 and in stock,
        // get just their names,
        // remove duplicates,
        // sort alphabetically,
        // keep only the top 5.
//        List<String> names = items.stream()
//                .filter(s -> s.getPrice() > 1000 && s.getQuantity() > 0)
//                .map(s -> s.getName())
//                .distinct()
//                .sorted()
//                .limit(5)
//                .toList();
//
//        System.out.println(names);


        // Task 4: Reduce for Aggregation
        // 4a. Total quantity of all items
//        int ans = items.stream()
//                .map(Item::getQuantity)
//                .reduce(0, Integer::sum);
//        System.out.println(ans);

        // 4b. Most expensive item
        Optional<Item> itemOptional = items.stream()
                .reduce((item1,item2) -> item1.getPrice() > item2.getPrice() ? item1:item2);
        System.out.println(itemOptional.get());

    }
}
