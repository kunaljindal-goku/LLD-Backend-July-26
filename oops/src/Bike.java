public class Bike extends Vehicle{

    @Override
    public double calculateFare(int km) {
        return 5.0*km;
    }
}
