package polymorphism;

import java.util.Spliterator;

public class Car extends Vehicle{

    String name = "Car";

    public void startEngine() {
        System.out.println("Enbgine has started for car: "+name);
    }

    @Override
    public double calculatePrice() {
        return 10.0;
    }

    public void turnOnMusic() {
        System.out.println("Music is turned on");
    }


}
