package facade;

import java.util.UUID;

public class Amazon {

    PlaceOrderFacade placeOrderFacade;

    public Amazon() {
        this.placeOrderFacade = new PlaceOrderFacade();
    }

    public void placeOrder(int itemId, int quantity) {
        Order order = new Order(String.valueOf(UUID.randomUUID()),itemId,quantity);
       placeOrderFacade.placeOrder(order);
   }

    public PlaceOrderFacade getPlaceOrderFacade() {
        return placeOrderFacade;
    }

    public void setPlaceOrderFacade(PlaceOrderFacade placeOrderFacade) {
        this.placeOrderFacade = placeOrderFacade;
    }
}
