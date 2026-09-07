public class Client {

    public static void main(String[] args) {
        Coffee coffee = new Decaf();
//
//        System.out.println(coffee.cost());
//        System.out.println(coffee.description());
//
        Condiment condiment = new Whip(coffee);
        System.out.println(condiment.cost());
        System.out.println(condiment.description());
    }
}
