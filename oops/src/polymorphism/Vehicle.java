package polymorphism;

public abstract class Vehicle {

    String name = "Vehicle";

    public void startEngine() {
        System.out.println("Engine has started for vehicle: "+name);
    }

    public abstract double calculatePrice();

    static void sayHello() {
        System.out.println("Hello from Vehicle");
    }
}
