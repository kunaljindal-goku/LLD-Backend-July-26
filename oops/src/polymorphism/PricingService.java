package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PricingService {

    List<Vehicle> vehicles;

    public PricingService() {
        vehicles = new ArrayList<>();
    }

    public void printPrice() {
        for(Vehicle v: vehicles) {
            System.out.println(v.calculatePrice());
        }
    }
}
