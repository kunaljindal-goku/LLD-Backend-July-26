package facade;

public class LoyaltyService implements PlaceOrderSubscriber{

    public LoyaltyService(Amazon amazon) {
        amazon.getPlaceOrderFacade().subscribe(this);
    }

    public void updateLoyalty(Order order) {
        System.out.println("Loyality updated for "+order.getOrderId());
    }

    @Override
    public void onOrderPlaced(Order order) {
        updateLoyalty(order);
    }
}
