public class Penguin extends Bird implements Danceable{
    public Penguin(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void dance() {
        System.out.println("Penguin is dancing");
    }
}
