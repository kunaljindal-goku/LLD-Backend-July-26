public class Espresso implements Coffee{
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "Espresso";
    }
}
