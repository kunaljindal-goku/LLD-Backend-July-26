public class Client5 {

    public static void main(String[] args) {
        Car c = new Car(123,"Maruti Suzuki", 4, 5,"Sony");
        System.out.println(c.calculateFare(10));

        Bike b = new Bike();
        System.out.println(b.calculateFare(10));
    }
}
