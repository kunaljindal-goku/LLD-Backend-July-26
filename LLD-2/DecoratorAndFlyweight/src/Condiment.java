public abstract class Condiment {

    protected Coffee coffee;

    public Condiment(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract int cost();

    public abstract String description();
}
