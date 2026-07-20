import java.util.Spliterator;

public class Driver {

    int driverId;
    String name;
    double rating;
    boolean isOnline;
    static int totalDrivers;

    static {

        totalDrivers = 15;
        System.out.println("This is executed at load time of driver class");
    }

    public Driver() {
        totalDrivers++;
    }

    public Driver(int driverId, String name, double rating, boolean isOnline) {
        this.driverId =driverId;
        this.name = name;
        this.rating = rating;
        this.isOnline = isOnline;
        totalDrivers++;
    }

    public Driver(String n) {
        name = n;
        totalDrivers++;
    }

    public void acceptRide(String rideId) {
        System.out.println("Ride has been accepted " + rideId + " Name = "+name);
    }

    public void changeStatus() {
        isOnline = !isOnline;
        System.out.println("Driver is" + isOnline);
    }

    public static void register() {
        System.out.println("This is a register method");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", isOnline=" + isOnline +
                '}';
    }
}
