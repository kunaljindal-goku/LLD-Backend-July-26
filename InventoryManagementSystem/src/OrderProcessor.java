import java.util.PriorityQueue;

public class OrderProcessor {

    private PriorityQueue<Order> pq;

    public OrderProcessor() {
        this.pq = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        pq.offer(order);
    }

    public Order processOrder() {
        return pq.poll();
    }
}
