public class Car extends Vehicle{
    String musicSystem;

    public void turnOnAc() {
        System.out.println(getVehicleNo());
        System.out.println("AC turned on");
    }

    public Car(int vehicleNo, String name, int wheels, int fuel,String musicSystem) {
        // parent constructor
       // super(vehicleNo,name,wheels,fuel);
        System.out.println("Car constrcutor caled");
        this.musicSystem = musicSystem;
    }

    public double calculateFare(int km) {
        return 10.0*km;
    }
}
