package polymorphism;

public class Client {

    public static void main(String[] args) {
//        PricingService pricingService = new PricingService();
//        pricingService.vehicles.add(new Car());
//        pricingService.vehicles.add(new Bike());
//        pricingService.vehicles.add(new Auto());
//
//        pricingService.printPrice();

        Vehicle v = new Car();
        v.sayHello();
        Vehicle.sayHello();

        System.out.println(v.calculatePrice());
    }
}
