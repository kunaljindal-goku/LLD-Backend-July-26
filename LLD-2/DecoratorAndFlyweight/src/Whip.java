public class Whip extends Condiment{
    public Whip(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost()+60;
    }

    @Override
    public String description() {
        return coffee.description()+"Whip";
    }
}
