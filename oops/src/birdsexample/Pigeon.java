package birdsexample;

public class Pigeon extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Pigeon flies");
    }
}
