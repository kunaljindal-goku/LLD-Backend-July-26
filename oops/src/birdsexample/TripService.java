package birdsexample;

public class TripService {

    PaymentGateway paymentGateway;

    public TripService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void completeTrip() {
        paymentGateway.pay();
    }
}
