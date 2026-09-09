package facade;

public class RecommendationService implements PlaceOrderSubscriber{

    public RecommendationService(Amazon amazon) {
        amazon.getPlaceOrderFacade().subscribe(this);
    }

    public void updateReco(Order order) {
        System.out.println("Updating recommendations based on "+order.orderId);
    }

    @Override
    public void onOrderPlaced(Order order) {
        updateReco(order);
    }
}
