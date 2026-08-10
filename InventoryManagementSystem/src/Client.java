import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Client {

    public static void main(String[] args) {
        Item i1  = new Item("1","Bat",10,1000);
        Item i2  = new Item("2","Bowl",20,200);
        Item i3  = new Item("3","Shirt",15,800);
        Item i4  = new Item("3","Jeans",12,800);

//        Inventory<Book> booksInventory = new Inventory();
//
//        List<Item> items = new ArrayList<>();
//        items.add(i1);
//        items.add(i2);
//        items.add(i3);
//        items.add(i4);

        PriorityQueue<Item> pq = new PriorityQueue<>(new ItemPriceComparator());
        pq.add(i1);
        pq.add(i2);
        pq.add(i3);
        pq.add(i4);

//        System.out.println(pq);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

     //   Collections.sort(items);


//        List<Item> items2 = new ArrayList<>();
//        items2.add(i1);
//        items2.add(i2);
//        items2.add(i3);
//        items2.add(i4);
//        Collections.sort(items2,new ItemPriceComparator());
//        System.out.println(items2);
//
//
//        System.out.println(items);
    }

}
