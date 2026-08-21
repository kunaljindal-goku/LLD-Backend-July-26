public class Dove extends Bird implements Flyable{
    public Dove(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void fly() {
        System.out.println("Dove is flying");
    }

    void sleep() {
        System.out.println("Dove is sleeping");
    }
}
