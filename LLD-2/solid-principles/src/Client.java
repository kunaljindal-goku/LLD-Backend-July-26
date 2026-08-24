

public class Client {

    static void makeBirdFly(Flyable b) {
        System.out.println("Bird is flying");
        b.fly();
    }

    public static void main(String[] args) {
        Dove dove = new Dove("Dove",10,"white", new HighFlyingBird());
//        makeBirdFly(dove);
//
//        Pigeon pigeon = new Pigeon("Pigeon",10,"white");
//        makeBirdFly(pigeon);
//
//        Penguin penguin = new Penguin("Pigeon",10,"white");
//        makeBirdFly(penguin);

        dove.fly();

        Dove d1 = new Dove("Dove",10,"white", new LowFlyingBird());
        d1.fly();
    }
}
