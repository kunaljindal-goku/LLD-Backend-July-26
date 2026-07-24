package birdsexample;

public class Penguin extends Bird{
    public void fly() {
        throw new RuntimeException("Penguin can't flow");
    }
}
