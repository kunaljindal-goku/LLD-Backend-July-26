package facade;

public class Client {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();

        LoyaltyService loyaltyService = new LoyaltyService(amazon);
        RecommendationService recommendationService = new RecommendationService(amazon);


        amazon.placeOrder(1,10);
    }
}
