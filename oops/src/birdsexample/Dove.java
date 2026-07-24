package birdsexample;

public class Dove extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Doven flies");
    }

    @Override
    public String toString() {
        return "Dove{}";
    }
}
