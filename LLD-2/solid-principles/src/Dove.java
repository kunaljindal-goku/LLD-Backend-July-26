public class Dove extends Bird implements Flyable{

    private Flyer flyer;

    public Dove(String name, int age, String color, Flyer flyer) {
        super(name, age, color);
        this.flyer = flyer;
    }

    @Override
    public void fly() {
        flyer.flyAltitude();
        System.out.println("Dove is flying");
    }

    void sleep() {
        System.out.println("Dove is sleeping");
    }
}
