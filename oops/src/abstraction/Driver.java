package abstraction;

public class Driver extends HumanUser implements Drivable{

    public void acceptRide() {
        System.out.println("Ride accepted");
    }
}
