package facade;

public class InvoiceService {

    public void generateInvoice(Order order) {
        System.out.println("Geenrating invoice for order Id: "+order.orderId);
    }
}
