package abstraction;

public class RoboticDriver implements Drivable{
    @Override
    public void acceptRide() {
        System.out.println("Robotic Driver accepted ride");
    }
}
