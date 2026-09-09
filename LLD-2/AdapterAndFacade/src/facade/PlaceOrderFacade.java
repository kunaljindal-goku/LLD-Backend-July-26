package facade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlaceOrderFacade {
    private MailService mailService;
    private InvoiceService invoiceService;
    private InventoryService inventoryService;

    private List<PlaceOrderSubscriber> subscribers;


    public PlaceOrderFacade() {
        this.inventoryService = new InventoryService();
        this.mailService = new MailService();
        this.invoiceService = new InvoiceService();
        this.subscribers = new ArrayList<>();
    }

    // expose TWO APIs
    public void subscribe(PlaceOrderSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(PlaceOrderSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void placeOrder(Order order) {
        try {
            inventoryService.updateInventory(order);
            mailService.sendEmail(order);
            invoiceService.generateInvoice(order);
            notifyAllSubscribers(order);
        } catch (Exception e) {
            System.out.println("SOmething has gone wrong. ");
        }
    }

    private void notifyAllSubscribers(Order order) {
        for(PlaceOrderSubscriber subscriber: subscribers) {
            subscriber.onOrderPlaced(order);
        }
    }
}
