import java.nio.file.FileAlreadyExistsException;
import java.util.Spliterator;

public class Driver {

    private final int driverId;
    private String name;
    private double rating;
    private boolean isOnline;
    static int totalDrivers;

    static {
        totalDrivers = 15;
        System.out.println("This is executed at load time of driver class");
    }

    public Driver() {
        this.driverId = totalDrivers;
        totalDrivers++;
    }

    public Driver(String name,
                  double rating,
                  boolean isOnline) {
        this.driverId = totalDrivers;
        this.name = name;
        this.rating = rating;
        this.isOnline = isOnline;
        totalDrivers++;
    }

    public Driver(int driverId, Driver other) {
        this.driverId = driverId;
        this.name = other.name;
        this.rating = other.rating;
        this.isOnline = other.isOnline;
    }

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

//    public Driver(String name, double rating) {
//       this(0,name,rating, false);
//    }

    public Driver(String name, int driverId, double rating) {
        this(driverId, name);
        this.rating = rating;

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

    public void setRating(double rating) {
        if(rating < 0 || rating > 5) {
            throw new RuntimeException("Invalid rating value");
        }
        this.rating = rating;
    }

    public double getRating() {
        return this.rating;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public static int getTotalDrivers() {
        return totalDrivers;
    }

    public static void setTotalDrivers(int totalDrivers) {
        Driver.totalDrivers = totalDrivers;
    }


}
