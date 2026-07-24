package birdsexample;

public class Crow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("crow is flying");
    }
}
