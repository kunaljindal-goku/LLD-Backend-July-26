public class Pigeon extends Bird implements Flyable, Danceable{
    public Pigeon(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    public void dance() {
        System.out.println("Piegon is dancing");
    }
}
